package za.ac.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Library_Member;


import java.util.List;


@Repository
public interface MemberRepository extends JpaRepository<Library_Member, String>  {
    //public List<Library_Librarian> findByID(int id);
}
