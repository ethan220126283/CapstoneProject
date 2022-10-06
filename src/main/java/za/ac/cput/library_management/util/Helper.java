package za.ac.cput.library_management.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    //Check for null or empty String field
    public static boolean isNullorEmpty(String s){
        return (s == null || s.equals ("") || s.isEmpty()|| s.equalsIgnoreCase("null"));
    }

    public static boolean isNullorEmptyObject(Object o){
        return (o == null);
    }

    //Check for null or empty int field
    public static boolean isZero(int i){
        return (i == 0);
    }


    public static void isNull(String paramName, Object o)
    {
        if(o == null) throw new IllegalArgumentException(
                String.format("Invalid value for params: %s", paramName)
        );
    }
    /*public static void checkStringParam(String paramName, String paramValue)
    {
        if(isEmptyOrNull(paramValue))
            throw new IllegalArgumentException(
                    String.format("Invalid value for params: %s", paramName)
            );
    }
*/

    public static boolean isValidEmail(String paramName, String emailAddress){
        EmailValidator validateEmail = EmailValidator.getInstance();
        if (!validateEmail.isValid(emailAddress))
            throw new IllegalArgumentException(
                    String.format("Invalid value for params: %s", paramName)
            );
        return validateEmail.isValid(emailAddress);
    }

    public static boolean isValidPostalCode(String paramName, int postalCode) {
        int postalCodeLength = String.valueOf(postalCode).length();
        if(!isValidRange(postalCode, 1000, 9999) && postalCodeLength != 4)
            throw new IllegalArgumentException(
                    String.format("Invalid value for params: %s", paramName)
            );
        return true;
    }

    private static boolean isValidRange(int value, int begin, int end) {
        return value > begin && value < end;
    }

    //Returns current date and time
    public static String[] getDateAndTimeSeparate(Date date) {
        date = new Date();
        Format dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateTime = dateFormat.format(date);
        return dateTime.split(" ");
    }
}
