package za.ac.cput.library_management.service;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 *   Date:       09/10/2022
 */



import za.ac.cput.library_management.domain.Member;

import java.util.List;

public interface MemberService extends IService<Member, String>{

    public List<Member> getAll();

}