package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.library_management.domain.Library_Item;

public interface Library_ItemRepository extends JpaRepository<Library_Item, String> {
}
