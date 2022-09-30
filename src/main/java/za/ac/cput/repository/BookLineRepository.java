package za.ac.cput.repository;
/*
    BookLine.repository.java
    Lana Africa (216166640)
    Capstone Project - Repository
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.BookLine;

public interface BookLineRepository extends JpaRepository<BookLine, String> {
}
