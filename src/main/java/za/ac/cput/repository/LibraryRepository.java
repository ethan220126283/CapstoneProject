package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, String> {
    public Library findByName(String name);
}
