package com.bridgelabz;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class readName_Email {
    public static void main(String[] args) {
        try {
            // Step 1: Create ObjectMapper
            ObjectMapper mapper = new ObjectMapper();
            String file = "C:\\Users\\Piyush\\OneDrive\\Desktop\\bridgelabz-workspace\\JAVA_IO\\JSON\\src\\main\\java\\com\\bridgelabz\\info.json";
            // Step 2: Load JSON from file into JsonNode
            JsonNode root = mapper.readTree(new File(file));

            // Step 3: Extract specific fields
            String name = root.get("name").asText();
            String email = root.get("email").asText();


            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
