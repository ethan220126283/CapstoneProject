package za.ac.cput.library_management.api;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Library;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class LibraryAPITest {

    @Autowired LibraryAPI api;

    @Test
    void a_addLibrary() {
        api.addLibrary("4", "Orange Road Library", "78 Orange Road", "021 854 9327");
    }

    @Test
    void b_getLibraryNames() {
        List<String> names = api.getLibraryNames();
        System.out.println(names);
        assertNotNull(names);
    }

    @Test
    void c_getLibraries() {
        List<Library> libraries = api.getLibraries();
        System.out.println(libraries);
        assertNotNull(libraries);
    }

    @Test
    void d_getLibraryByName() {
        Library result = api.getLibraryByName("Orange Road Library");
        System.out.println(result);
        assertEquals("Orange Road Library", result.getName());
    }

    @Test
    void e_deleteLibraryById() {
        assertTrue(api.deleteLibraryById("4"));
    }
}