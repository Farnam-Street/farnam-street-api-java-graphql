package com.farnam.graphqlapi.helper;

import java.util.HashMap;
import java.util.Map;

public class APIHelper {

    public static Map<String,String>Message(String message){
        Map<String,String> responseMap = new HashMap<>();
        responseMap.put("data",message);
        responseMap.put("metadata","Sample API");
        return responseMap;
    }
}
