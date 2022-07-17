package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;
import com.sun.xml.internal.ws.client.ClientSchemaValidationTube;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    List<Integer> list;

    public ListUtility(){
        list = new ArrayList<>();
    }

    public Boolean add(Integer i) {
//        return null;
        return list.add(i);
    }

    public Integer size() {
//        return null;
        return list.size();
    }

    public List<Integer> getUnique() {
        return null;
    }

    public String join() {
        return null;
    }

    public Integer mostCommon() {
//        return null;
        Integer[] intArr = list.toArray(new Integer[0]);
        return null;
    }

    public Boolean contains(Integer valueToAdd) {
//        return null;
        return list.contains(valueToAdd);
    }
}
