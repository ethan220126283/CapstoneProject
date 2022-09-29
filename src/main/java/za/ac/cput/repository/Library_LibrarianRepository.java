package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Library_Librarian;

@Repository
public interface Library_LibrarianRepository extends JpaRepository<Library_Librarian, Integer> {
    public Library_Librarian findByID(int id);
}