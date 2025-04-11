package com.bridgelabz;

import com.fasterxml.jackson.databind.ObjectMapper;

class User {
    public String name;
    public int age;
    public String email;
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
public class Jackson {
    public static void main(String[] args) {
        try {
            ObjectMapper objMapper = new ObjectMapper();
            User user = new User("John Wick",35,"abc@gmail.com");
            // convert obj to jsonString
            String jsonString = objMapper.writeValueAsString(user);
            System.out.println(jsonString.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
