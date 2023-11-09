package org.example;

import com.google.gson.Gson;

public class GsonObjectManager<T extends Object> implements JsonObjectManager<T>{
    @Override
    public String toJson(T toJson) {
        return new Gson().toJson(toJson);
    }
}
