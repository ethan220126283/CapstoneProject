package za.ac.cput.library_management.service.impl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.factory.TypeFactory;
import static org.junit.jupiter.api.Assertions.*;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class TypeServiceImplTest {
    @Autowired
    private TypeServiceImpl service;

    private static final Type Type1 = TypeFactory.createType(
            "11",
            "JohnDoes"
    );

    private static final Type Type2 = TypeFactory.createType(
            "14",
            "J6nDoes"
    );
    private static final Type Type3 = TypeFactory.createType(
            "16",
            "Kenny"
    );

    @Test
    void a_save() {
        System.out.println("Created: ");
        Type created1 = service.save(Type1);
        assertNotNull(created1);
        System.out.println(created1);

        Type created2 = service.save(Type2);
        assertNotNull(created2);
        System.out.println(created2);

        Type created3 = service.save(Type3);
        assertNotNull(created3);
        System.out.println(created3);
    }
    @Test
    void b_read() {
        Type read = service.read(Type2.getId());
        assertEquals(read.getId(), Type2.getId());
        System.out.println("Read: " + read);
    }

    @Test
    void c_delete() {
        boolean success = service.delete(Type1.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }
}
