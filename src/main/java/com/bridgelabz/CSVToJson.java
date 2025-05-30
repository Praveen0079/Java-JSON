package com.bridgelabz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CSVToJson {
    public static void main(String[] args) throws IOException {
        String src="src/SampleData/Sampledata.csv";

        List<Map<String,String>> list=ReadFile(src);

        WriteJsonFile(list);
        System.out.println("File written succesfully");
    }

    static List<Map<String,String>> ReadFile(String src){

        List<Map<String,String>> ans=new ArrayList<>();
        try(CSVReader reader=new CSVReader(new FileReader(src))){
            String [] header=reader.readNext();

            if(header==null){
                throw new IOException("Header is empty");
            }

            String [] line;

            while((line=reader.readNext())!=null){
                Map<String,String> map=new LinkedHashMap<>();
                for(int i=0;i<header.length;i++){
                    map.put(header[i],line[i]);
                }
                ans.add(map);
            }
            return ans;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void WriteJsonFile(List<Map<String,String>> list) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Pretty Print JSON

        objectMapper.writeValue(new File("src/SampleData/Sampledata.json"), list);
    }
}
