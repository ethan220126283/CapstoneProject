package za.ac.cput.library_management.factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.factory.TypeFactory;

import static org.junit.jupiter.api.Assertions.*;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

class TypeFactoryTest {
    private Type type;

    @BeforeEach
    void setUp()
    {
        type = TypeFactory.buildType("John", 123);
    }

    @Test
    void testNameCreation()
    {
        assertAll(
                ()-> assertNotNull(type),
                ()-> assertSame(Type.class, type.getClass())
        );
    }

    @Test
    void testNullType_name()
    {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->  TypeFactory.buildType("", 32));
        String expectedMessage = "Invalid value for params: Name";
        String returnedMessage = exception.getMessage();
        assertNotEquals(expectedMessage, returnedMessage);
    }



    @Test
    void testNullType_id()
    {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()->  TypeFactory.buildType("", 20));
        String expectedMessage = "Invalid value for params:  id";
        String returnedMessage = exception.getMessage();
        assertNotNull(expectedMessage, returnedMessage);
    }

}