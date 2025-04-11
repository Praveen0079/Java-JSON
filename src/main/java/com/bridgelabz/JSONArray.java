package com.bridgelabz;

import org.json.JSONObject;
public class JSONArray {
    public static void main(String[] args) {
        org.json.JSONArray skills = new org.json.JSONArray();
        skills.put("Java");
        skills.put("Spring");
        skills.put("SQL");


        JSONObject user = new JSONObject();
        user.put("name", "Alice");
        user.put("skills", skills); // Add JSON array


        System.out.println(user.toString());
    }
}

