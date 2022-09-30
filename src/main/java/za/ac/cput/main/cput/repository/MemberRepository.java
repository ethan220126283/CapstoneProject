package za.ac.cput.main.cput.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.main.cput.domain.Library_Member;


@Repository
public interface MemberRepository extends JpaRepository<Library_Member, String>  {
    //public List<Library_Librarian> findByID(int id);
}
