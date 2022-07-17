package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;

public class Router {
    LinkedHashMap<String, String> address;
    LinkedHashMap<String, String> duplicate;
    public Router(){
        address = new LinkedHashMap<>();
        duplicate = new LinkedHashMap<>();
    }
    public void add(String path, String controller) {
        if (address.containsKey(path))
            duplicate.put(path, controller);
        else
            address.put(path, controller);
    }

    public Integer size() {
//        return null;
        return address.size();
    }

    public String getController(String path) {
//        return null;
        return address.get(path);
    }

    public void update(String path, String studentController) {
        address.put(path, studentController);
    }

    public void remove(String path) {
        address.remove(path);
    }
}
