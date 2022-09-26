package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Librarian;

 @Repository
    public interface LibrarianRepository extends JpaRepository<Librarian, String> {
        public Librarian findByName(String name);
    }