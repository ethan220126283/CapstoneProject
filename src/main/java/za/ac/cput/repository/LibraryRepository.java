package za.ac.cput.repository;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Library;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, String> {
    //public List<Library> findByName(String name);
}
