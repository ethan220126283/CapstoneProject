package za.ac.cput.factory;

import za.ac.cput.domain.Item;
import za.ac.cput.util.Helper;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       27/09/2022
 */

public class ItemFactory {

    //Factory method
    public static Item createItem(String id, String name, String author, String genre, String status) {

        if (Helper.isNullorEmpty(id) || Helper.isNullorEmpty(name)){
            throw new IllegalArgumentException("id and name mandatory attributes.");
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
