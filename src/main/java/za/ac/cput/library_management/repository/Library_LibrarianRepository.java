package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Library_Librarian;

@Repository
public interface Library_LibrarianRepository extends JpaRepository<Library_Librarian, String> {
}