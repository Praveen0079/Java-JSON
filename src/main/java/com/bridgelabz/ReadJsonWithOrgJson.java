package com.bridgelabz;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadJsonWithOrgJson {
    public static void main(String[] args) {
        String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\JSON\\src\\main\\java\\com\\bridgelabz\\info.json";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine())!=null){
                sb.append(line);
            }
            JsonObject jsonObject = JsonParser.parseString(sb.toString()).getAsJsonObject();
            String name = jsonObject.get("name").getAsString();
            String email = jsonObject.get("email").getAsString();
            System.out.println(name);
            System.out.println(email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
