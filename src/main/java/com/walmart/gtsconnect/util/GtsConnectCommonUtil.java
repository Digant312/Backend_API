package com.walmart.gtsconnect.util;

import com.google.gson.Gson;

public class GtsConnectCommonUtil {

    public static Gson gson = new Gson();

    public static Object getObjectForJSON(String jsonString, Class type){
        try{
            return gson.fromJson(jsonString, type);
        } catch(Exception e){
            return null;
        }
    }
}
