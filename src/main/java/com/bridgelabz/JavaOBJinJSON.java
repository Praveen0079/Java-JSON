
package com.bridgelabz;

import org.json.JSONObject;

class Car{
    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //Getters
    public String getBrand(){
        return  brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

}

public class JavaOBJinJSON {
    public static void main(String[] args) {
        Car car = new Car("BMW", "M4", 2015);

        JSONObject json = new JSONObject();

        json.put("brand", car.getBrand());
        json.put("model", car.getModel());
        json.put("year", car.getYear());

        System.out.println("Car as a JSON" );
        System.out.println(json.toString(2));
    }
}//package com.bridgelabz;
//
//import org.json.JSONObject;
//import com.google.gson.JsonObject;
//
//public class JavaOBJinJSON {
//    public static void main(String[] args) {
//        JsonObject jsonObject = new JsonObject();
//        jsonObject.addProperty("Brand", "BMW");
//        jsonObject.addProperty("Model","M4");
//        jsonObject.addProperty("HP","856");
//
//        System.out.println(jsonObject.toString());
//
//    }
//}
