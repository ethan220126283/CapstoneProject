package za.ac.cput.factory;

import za.ac.cput.domain.Item;
import za.ac.cput.util.Helper;

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
