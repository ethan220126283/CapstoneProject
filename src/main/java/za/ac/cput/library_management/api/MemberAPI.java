package za.ac.cput.library_management.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.MemberFactory;
import za.ac.cput.library_management.service.impl.MemberServiceImpl;

import java.util.Arrays;
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

    public void addMember(String id,String name,String address, String tel, String status){
        Member member = MemberFactory.createMember(id,name,address,tel,status);
        memberService.save(member);
    }

   //Delete members by id
    public Boolean deleteMemberById(String id){
        return memberService.delete(id);

    }

    //Return Object[][]
    public Object[][] getMembersTable() {

        List<Member> members = getMembers();
        Object[][] data = new Object[members.size()][];

        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            int j = 0;
            data[i][j] = member.getId();
            j++;
            data[i][j] = member.getName();
            j++;
            data[i][j] = member.getAddress();
            j++;
            data[i][j] = member.getTel();
            j++;
            data[i][j] = member.getStatus();
        }
        //System.out.println(Arrays.deepToString(data));
        return data;
    }

}
