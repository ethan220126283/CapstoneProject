package za.ac.cput.library_management.repository;

/*   Name:       Adrian Bennett
 *   Student#:   214075982
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
}