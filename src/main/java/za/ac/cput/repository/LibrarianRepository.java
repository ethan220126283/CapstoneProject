package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Librarian;

import java.util.List;

@Repository
    public interface LibrarianRepository extends JpaRepository<Librarian, String> {
        //public List<Librarian> findByName(String name);
    }