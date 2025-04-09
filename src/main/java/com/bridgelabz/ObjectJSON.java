package com.bridgelabz;

import org.json.JSONObject;

public class ObjectJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();
        student.put("name","Maneesh");
        student.put("age",19);
        student.put("subjects","{Maths,Physics,Chemistry,Computer}");
        System.out.println(student.toString()); // Convert to JSON String
    }
}