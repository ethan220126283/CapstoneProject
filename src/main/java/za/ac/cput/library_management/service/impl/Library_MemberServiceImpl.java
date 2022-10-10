package za.ac.cput.library_management.service.impl;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 *   Date:       09/10/2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Library_Member;
import za.ac.cput.library_management.repository.Library_MemberRepository;
import za.ac.cput.library_management.service.Library_MemberService;


@Service
public class Library_MemberServiceImpl implements Library_MemberService {

    private Library_MemberRepository repository;

    @Autowired Library_MemberServiceImpl(Library_MemberRepository repository){this.repository = repository;}

    @Override
    public Library_Member save(Library_Member library_member){ return this.repository.save(library_member);}

    @Override
    public Library_Member read(String id) { return this.repository.findById(id).orElse(null);}

    @Override
    public boolean delete(String id){
        if (this.repository.existsById(id)){
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }


    }

