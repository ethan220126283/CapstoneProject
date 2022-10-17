package za.ac.cput.library_management.service.impl;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 *   Date:       09/10/2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.repository.MemberRepository;
import za.ac.cput.library_management.service.MemberService;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository repository;

    @Autowired MemberServiceImpl(MemberRepository repository){this.repository = repository;}

    @Override
    public Member save(Member member) {return this.repository.save(member);}


    @Override
    public Member read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public List<Member> getAll() { return this.repository.findAll().stream().collect(Collectors.toList());}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
