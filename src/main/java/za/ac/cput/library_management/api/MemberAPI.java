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

    public void addMember(Member member){
        memberService.save(member);
    }

   //Delete members by id
    public Boolean deleteMemberById(String id){
        return memberService.delete(id);

    }

    //Return Object[][]
    public Object[][] getMembersTable() {

        List<Member> members = memberService.getAll();
        String[] array;
        Object[][] objects = new Object[members.size()][5];

        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            if (member == null) {
                objects[i] = null;
            }
            else {
                objects[i][0] = member.getId();
                objects[i][1] = member.getName();
                objects[i][2] = member.getAddress();
                objects[i][3] = member.getTel();
                objects[i][4] = member.getStatus();
            }
        }

        return objects;
    }

}
