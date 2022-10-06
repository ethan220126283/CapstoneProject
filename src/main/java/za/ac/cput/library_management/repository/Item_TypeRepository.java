package za.ac.cput.library_management.repository;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Item_Type;

@Repository
public interface Item_TypeRepository extends JpaRepository<Item_Type, String> {
}