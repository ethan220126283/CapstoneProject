package za.ac.cput.util;

public class Helper {
    
    //Check for null or empty String field
    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals ("") || s.isEmpty()|| s.equalsIgnoreCase("null"));
    }

    //Check for null or empty int field
    public static boolean isZero(int i){
        return (i == 0);
    }
}
