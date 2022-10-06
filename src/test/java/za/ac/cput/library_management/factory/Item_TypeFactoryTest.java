package za.ac.cput.library_management.factory;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Item_Type;
import za.ac.cput.library_management.domain.Type;

import static org.junit.jupiter.api.Assertions.*;

class Item_TypeFactoryTest {

    Item item = ItemFactory.createItem(
            "1",
            "Narnia",
            "C.S. Lewis",
            "Fantasy",
            "Available"
    );

    Type type = TypeFactory.createType(
            "1",
            "Book"
    );

    @Test
    void createItem_Type() {
        Item_Type item_type = Item_TypeFactory.createItem_Type(
                "1",
                item,
                type
        );
        System.out.println(item_type.toString());
        assertNotNull(item_type);
    }
}