package za.ac.cput.library_management.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.library_management.domain.Member;

import java.util.List;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
class MemberAPITest {

    @Autowired MemberAPI api;

    @Test
    void a_addMember(){api.addMember(
            "BellJAmos1","John Amos","598 Bellville Cape Town","0219856523","active");}
    @Test
    void b_getMembersById(){
        Member result = api.getMembersById("BellJAmos1");
        System.out.println(result);
        assertEquals("BellJAmos1",result.getId());
    }


    @Test
    void c_getMemberByName(){
        Member result =api.getMembersByName("John Amos");
        System.out.println(result);
        assertEquals("John Amos",result.getName());
    }

    @Test
    void d_getMembers(){
        List <Member> members = api.getMembers();
        System.out.println(members);
        assertNotNull(members);
    }

    @Test
    void e_deleteMemeberById(){
        assertTrue(api.deleteMemberById("BellJAmos"));

    }



}