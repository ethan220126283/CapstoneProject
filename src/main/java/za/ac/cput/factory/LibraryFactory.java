package za.ac.cput.factory;

import za.ac.cput.domain.Library;
import za.ac.cput.util.Helper;

public class LibraryFactory {
    
    //Factory Method
    public static Library createLibrary(int library_Id, String library_Name, String library_Address, String library_Tel) {
       
        if (Helper.isZero(library_Id) || Helper.isNullorEmpty(library_Name)){
            throw new IllegalArgumentException("library_Id and library_Name mandatory attributes.");
        }

        //Return
        return new Library.Builder()
        .theirLibrary_Id(library_Id)
        .theirLibrary_Name(library_Name)
        .theirLibrary_Address(library_Address)
        .theirLibrary_Tel(library_Tel)
        .build();
    }
}
