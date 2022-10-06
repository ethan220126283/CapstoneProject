package za.ac.cput.library_management.repository;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
}