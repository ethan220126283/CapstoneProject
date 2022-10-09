package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Bookline;

@Repository
public interface BooklineRepository extends JpaRepository<Bookline, String> {
}