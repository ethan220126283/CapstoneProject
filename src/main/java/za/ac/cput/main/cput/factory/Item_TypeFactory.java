package za.ac.cput.main.cput.factory;
import za.ac.cput.main.cput.domain.Item_Type;
import za.ac.cput.main.cput.util.Helper;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

public class Item_TypeFactory {
    public static Item_Type buildItem_Type(String item_name, int type_id) {
        if (Helper.isZero(type_id) || Helper.isNullorEmpty(item_name)) {
            throw new IllegalArgumentException("");
        }

        return new Item_Type.Builder()
                .setType_id(type_id)
                .setItem_id(item_name)
                .build();
    }
}
