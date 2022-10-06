package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Library_Item;

@Repository
public interface Library_ItemRepository extends JpaRepository<Library_Item, String> {
}