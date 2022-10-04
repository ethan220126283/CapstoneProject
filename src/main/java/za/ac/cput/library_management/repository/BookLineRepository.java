package za.ac.cput.library_management.repository;
/*
    BookLine.repository.java
    Lana Africa (216166640)
    Capstone Project - Repository
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.library_management.domain.BookLine;

public interface BookLineRepository extends JpaRepository<BookLine, String> {
}
