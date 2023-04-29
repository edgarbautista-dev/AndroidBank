package com.example.siuag.util;

public class StringUtils {

    public static boolean isEmpty(Object object){
        if(object == null){
            return true;
        }

        if(object instanceof String){
            return ((String) object).isEmpty();
        }

        return false;
    }
}
