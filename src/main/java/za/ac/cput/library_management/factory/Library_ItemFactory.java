package za.ac.cput.library_management.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */

import za.ac.cput.library_management.domain.Library_Item;
import za.ac.cput.library_management.util.Helper;

public class Library_ItemFactory {

    //Factory method
    public static Library_Item createLibrary_Item(int library_id, String item_id) {

        if (Helper.isZero(library_id) || Helper.isNullorEmpty(item_id)){
            throw new IllegalArgumentException("");
        }

        //Return
        return new Library_Item.Builder()
                .theirLibrary_Id(library_id)
                .theirItem_Id(item_id)
                .build();
    }
}
