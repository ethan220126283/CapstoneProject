package za.ac.cput.main.cput.repository;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       27/09/2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.main.cput.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {
    //public List<Item> findByName(String name);
}
