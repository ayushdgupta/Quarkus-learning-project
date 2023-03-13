package com.guptaji.util;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MobileUtility {

    public static List<String> mobileList = new ArrayList<>();

    static {
        mobileList.add("Samsung");
        mobileList.add("Apple");
        mobileList.add("Nokia");
    }

    public static List<String> mobileList(){
        return mobileList;
    }

    public static List<String> addNewMobileName(String mobileName){
        if (!mobileList.contains(mobileName)){
            mobileList.add(mobileName);
        }
        return mobileList;
    }

    public static List<String> updateMobileName(String oldName, String newName){
        List<String> resultantList = mobileList.stream().map(tempMobileName -> {
            if (tempMobileName.equalsIgnoreCase(oldName)) {
                return newName;
            } else {
                return tempMobileName;
            }
        }).collect(Collectors.toList());
        return resultantList;
    }

    public static Response deleteMobileNumber(String mobileName){
        if (mobileList.contains(mobileName)){
            mobileList = mobileList.stream().filter(tempMobileName -> !tempMobileName.equalsIgnoreCase(mobileName)).collect(Collectors.toList());
            return Response.ok(mobileList).build();
        }
        // we can also use simple remove function
        // resultantList.remove(mobileName);
        // return Response.noContent().build();
        return Response.status(Response.Status.NOT_FOUND).build();
    }
}
