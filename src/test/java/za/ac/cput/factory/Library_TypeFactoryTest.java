package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Library_Type;

import static org.junit.jupiter.api.Assertions.*;

class Library_TypeFactoryTest {

    @Test
    void createLibrary_Type() {
        Library_Type library_type = Library_TypeFactory.createLibrary_Type(
                1,
                1
        );
        System.out.println(library_type.toString());
        assertNotNull(library_type);
    }
}