package com.bridgelabz.inventory;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class InventoryDetails {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            Object data = parser.parse(new FileReader("src/main/resources/InventoryData.json"));
            JSONObject jsonObject = (JSONObject) data;
            JSONArray inventory = (JSONArray) jsonObject.get("inventory");

            System.out.println(inventory);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

