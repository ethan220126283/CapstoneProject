package za.ac.cput.library_management.factory;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Type;

import static org.junit.jupiter.api.Assertions.*;

class TypeFactoryTest {

    private Type type;

    @BeforeEach
    void setUp()
    {
        type = TypeFactory.createType("1","Book");
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
                ()->  TypeFactory.createType(null,null));
        String expectedMessage = "";
        String returnedMessage = exception.getMessage();
        assertEquals(expectedMessage, returnedMessage);
    }

}