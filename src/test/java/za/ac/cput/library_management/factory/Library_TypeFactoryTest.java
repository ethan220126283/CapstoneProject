package za.ac.cput.library_management.factory;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       30/09/2022
 */


import org.junit.jupiter.api.Test;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Type;
import za.ac.cput.library_management.domain.Type;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class Library_TypeFactoryTest {

    UUID uuid1 = UUID.randomUUID();
    UUID uuid2 = UUID.randomUUID();
    UUID uuid3 = UUID.randomUUID();
    Library library = LibraryFactory.createLibrary(uuid1.toString(),"Browns Public Library","123 Brownville Lane","034 234 5431");
    Type type = TypeFactory.createType(uuid2.toString(),"Book");

    @Test
    void createLibrary_Type() {
        Library_Type library_type = Library_TypeFactory.createLibrary_Type(
                uuid3.toString(),
                library,
                type
        );
        System.out.println(library_type.toString());
        assertNotNull(library_type);
    }
}