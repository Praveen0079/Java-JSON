package com.bridgelabz;

import org.json.JSONObject;

public class MergeJson {
    public static void main(String[] args) {
        JSONObject object1 = new JSONObject();

        object1.put("name ","john");
        object1.put("age ",35);

        JSONObject object2 = new JSONObject();

        object2.put("id",1420);
        object2.put("email ", "john@gmail.com");

        for(String  key : object2.keySet()){
            object1.put(key,object2.get(key));
        }

        System.out.println("Merged JSON objects: " + object1.toString(5));
    }
}