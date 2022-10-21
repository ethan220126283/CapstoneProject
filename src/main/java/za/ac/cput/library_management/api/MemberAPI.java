package za.ac.cput.library_management.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.MemberFactory;
import za.ac.cput.library_management.service.impl.MemberServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static za.ac.cput.library_management.factory.MemberFactory.createMember;

@Component
public class MemberAPI {

    private MemberServiceImpl memberService;

    @Autowired
    MemberAPI(MemberServiceImpl memberService) {

        this.memberService = memberService;

    }

    //Get all members
    public List<Member> getMembers(){
        return memberService.getAll();
    }

    //Get by members name
    public Member getMembersByName(String name) {

        List<Member> members = memberService.getAll();
        Member result = null;

        for(Member member : members ){

            if(Objects.equals(member.getName(),name)){
                result = member;
            }
        }
        return result;
    }

    //Get members by ID
    public Member getMembersById(String id){
      return memberService.read(id);
    }

    public void addMember(String id,String name,String address, String tel, String status){
        Member member = createMember(id,name,address,tel,status);
        memberService.save(member);
    }

   //Delete members by id
    public Boolean deleteMemberById(String id){
        return memberService.delete(id);

    }

    //Return Object[][]
    public Member[][] getMembersTable() {

        return null;
    }

}
