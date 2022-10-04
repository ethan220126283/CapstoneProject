package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.library_management.domain.Type;

/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

public interface TypeRepository extends JpaRepository<Type, String> {
// SQL commands come here

  /*  @Query(value = "SELECT t.name FROM type t WHERE t.typr_id = ?1 ORDER BY name abc", nativeQuery = true)
    List<String> (@Param("type_id") String type_id);*/
}
