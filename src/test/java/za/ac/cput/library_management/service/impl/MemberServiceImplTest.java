package za.ac.cput.library_management.service.impl;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 *   Date:       09/10/2022
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.MemberFactory;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
//@ContextConfiguration({"classpath*:za/ac/cput/library_management/LibraryManagementApplication.java"})
class MemberServiceImplTest {

    @Autowired
    private MemberServiceImpl service;

    private static final Member member1= MemberFactory.createMember(
            "Bel5985","Jason Ford","598 Belmont Street ,Bellville", "0219875698","active"
    );

    private static final Member member2= MemberFactory.createMember(
            "CPT598","Marry Norton","8 Walker Lane ,Ottery","0896589854","inactive"
    );
    private static final Member member3 = MemberFactory.createMember(
            "SPoint598", "Tom Brady","52 Palm Drive,Trenchtown","0689856847","active"
    );

    @Test
    void a_save(){
        System.out.println("Created: ");

        Member created1 = service.save(member1);
        assertNotNull(created1);
        System.out.println(created1);

        Member created2 = service.save(member2);
        assertNotNull(created1);
        System.out.println(created2);

        Member created3 = service.save(member3);
        assertNotNull(created1);
        System.out.println(created3);

    }


    @Test
    void b_read(){

        Member read = service.read(member2.getId());
        assertEquals(read.getId(), member2.getId());
        System.out.println("Read: " + read);

    }


    @Test
    void c_delete(){

        boolean success = service.delete(member1.getId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }



}