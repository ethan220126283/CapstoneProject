package za.ac.cput.library_management.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.MemberFactory;
import za.ac.cput.library_management.service.impl.MemberServiceImpl;

import java.util.List;
import java.util.Objects;

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

    public void addMember(String id,String name,String address, String tell, String status){
        Member member = MemberFactory.createMember(id,name,address,tell,status);
        memberService.save(member);
    }

   //Delete members by id
    public Boolean deleteMemberById(String id){
        return memberService.delete(id);

    }

    //Return Object[][]
    public Object[][] getMembersTable() {
        return null;
    }

}
