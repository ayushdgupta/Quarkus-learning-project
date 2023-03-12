package com.guptaji.util;

import java.util.ArrayList;
import java.util.List;

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
}
