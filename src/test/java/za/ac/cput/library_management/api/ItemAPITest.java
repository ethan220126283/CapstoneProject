package za.ac.cput.library_management.api;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Item;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ItemAPITest {
    @Autowired
    ItemAPI api;

    @Test
    void a_addItems(){api.addItems
            (
            "1",
            "Narnia",
            "C.S. Lewis",
            "Fantasy",
            "Available");}
    @Test
    void b_getItemsById(){
        Item result = api.getItemsById("1");
        System.out.println(result);
        assertEquals("1",result.getId());
    }


    @Test
    void c_getItemsByName(){
        Item result =api.getItemsByName("Narnia");
        System.out.println(result);
        assertEquals("Narnia",result.getName());
    }

    @Test
    void d_getItem(){
        List<Item> items = api.getItem();
        System.out.println(items);
        assertNotNull(items);
    }

    @Test
    void e_deleteItemsById(){
        assertTrue(api.deleteItemsById("1"));

    }

    @Test
    void  f_getItemsTable(){
        Object[][] items = api.getItemsTable();
        System.out.println(Arrays.deepToString(items));
    }
}
