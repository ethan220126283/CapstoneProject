package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.library_management.domain.Library_Type;

public interface Library_TypeRepository extends JpaRepository<Library_Type, String> {
}
