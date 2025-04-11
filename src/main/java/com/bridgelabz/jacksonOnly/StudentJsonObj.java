package com.bridgelabz.jacksonOnly;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class StudentJsonObj {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        //JSON object
        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Praveen");
        student.put("age", 21);

        //array of subjects
        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Computer");

        //Add array to student
        student.set("subjects", subjects);

        //Print formatted JSON
        String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        System.out.println(jsonOutput);
    }
}
