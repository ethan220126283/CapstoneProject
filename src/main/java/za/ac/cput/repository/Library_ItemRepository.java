package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Library_Item;

public interface Library_ItemRepository extends JpaRepository<Library_Item, String> {
}
