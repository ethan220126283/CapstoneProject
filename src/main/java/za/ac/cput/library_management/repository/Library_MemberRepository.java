package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Library_Member;


@Repository
public interface Library_MemberRepository extends JpaRepository<Library_Member, String> {


    //public List<Library_Librarian> findByID(int id);

}
