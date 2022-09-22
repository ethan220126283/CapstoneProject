package za.ac.cput.factory;

import za.ac.cput.domain.Library;
import za.ac.cput.util.Helper;

public class LibraryFactory {
    
    //Factory Method
    public static Library createLibrary(int id, String name, String address, String tel) {
       
        if (Helper.isZero(id) || Helper.isNullorEmpty(name)){
            throw new IllegalArgumentException("id and name mandatory attributes.");
        }

        //Return
        return new Library.Builder()
        .theirId(id)
        .theirName(name)
        .theirAddress(address)
        .theirTel(tel)
        .build();
    }
}
