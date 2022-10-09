package za.ac.cput.library_management.factory;

import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.util.Helper;

import java.util.UUID;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       27/09/2022
 */

public class ItemFactory {

    //Factory method
    public static Item createItem(String id, String name, String author, String genre, String status) {

        if (Helper.isNullorEmpty(name)){
            throw new IllegalArgumentException("name mandatory attribute.");
        }

        //Return
        return new Item.Builder()
                .theirID(id)
                .theirName(name)
                .theirAuthor(author)
                .theirGenre(genre)
                .theirStatus(status)
                .build();
    }
}
