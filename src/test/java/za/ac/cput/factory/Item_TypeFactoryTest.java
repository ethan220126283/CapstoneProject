package za.ac.cput.factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Item_Type;
import za.ac.cput.domain.Type;
import static org.junit.jupiter.api.Assertions.*;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

class Item_TypeFactoryTest {
    private Item_Type item_type;

    @BeforeEach
    void setUp()
    {
        item_type = Item_TypeFactory.buildItem_Type("John", 123);
    }

    @Test
    void testNameCreation()
    {
        assertAll(
                ()-> assertNotNull(item_type),
                ()-> assertSame(Type.class, item_type.getClass())
        );
    }

    @Test
    void testNullType_name()
    {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->  TypeFactory.buildType("", 32));
        String expectedMessage = "Invalid value for params: Name";
        String returnedMessage = exception.getMessage();
        assertEquals(expectedMessage, returnedMessage);
    }



    @Test
    void testNullType_id()
    {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->  TypeFactory.buildType("John", 20));
        String expectedMessage = "Invalid value for params:  id";
        String returnedMessage = exception.getMessage();
        assertEquals(expectedMessage, returnedMessage);
    }

}