package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Item;
import za.ac.cput.library_management.util.Helper;

public class Library_ItemFactory {

    public static Library_Item createLibrary_Item(String id, Library library, Item item) {

        if (Helper.isNullorEmpty(id) || Helper.isNullorEmptyObject(library) || Helper.isNullorEmptyObject(item)){
            throw new IllegalArgumentException("id mandatory attribute.");
        }

        //Return
        return new Library_Item.Builder()
                .theirId(id)
                .theirLibrary(library)
                .theirItem(item)
                .build();
    }
}
