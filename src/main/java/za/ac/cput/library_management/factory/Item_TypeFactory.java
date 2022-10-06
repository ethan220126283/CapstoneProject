package za.ac.cput.library_management.factory;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Item_Type;
import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.util.Helper;

public class Item_TypeFactory {
    public static Item_Type createItem_Type(String id, Item item, Type type) {
        if (Helper.isNullorEmptyObject(type) || Helper.isNullorEmptyObject(item) || Helper.isNullorEmpty(id) ) {
            throw new IllegalArgumentException("");
        }

        return new Item_Type.Builder()
                .theirId(id)
                .theirType(type)
                .theirItem(item)
                .build();
    }
}
