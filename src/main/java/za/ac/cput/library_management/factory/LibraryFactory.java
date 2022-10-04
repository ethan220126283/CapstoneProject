package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.util.Helper;

public class LibraryFactory {
    
    //Factory Method
    public static Library createLibrary(String id, String name, String address, String tel) {
       
        if (Helper.isNullorEmpty(id) || Helper.isNullorEmpty(name)){
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
