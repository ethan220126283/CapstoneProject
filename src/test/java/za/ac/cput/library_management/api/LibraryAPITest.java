package za.ac.cput.library_management.api;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.factory.LibraryFactory;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class LibraryAPITest {


    private Library library = LibraryFactory.createLibrary("CPT1","Cape Town Library","25 Belmont Road, Cape Town","0215978565");
    @Autowired LibraryAPI api;

    @Test
    void a_addLibrary() {
        api.addLibrary(library);
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

    @Test
    void f_getLibrariesTable(){
        System.out.println(Arrays.deepToString(api.getLibrariesTable()));
    }

}