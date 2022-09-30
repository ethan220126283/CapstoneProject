package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Library_Item;

import static org.junit.jupiter.api.Assertions.*;

class Library_ItemFactoryTest {

    @Test
    void createLibrary_Item() {
        Library_Item library_item = Library_ItemFactory.createLibrary_Item(
                1,
                "802-1234"
        );
        System.out.println(library_item.toString());
        assertNotNull(library_item);
    }
}