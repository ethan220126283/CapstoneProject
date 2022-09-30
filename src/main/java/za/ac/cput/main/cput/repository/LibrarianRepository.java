package za.ac.cput.main.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.main.cput.domain.Librarian;

@Repository
    public interface LibrarianRepository extends JpaRepository<Librarian, String> {
        //public List<Librarian> findByName(String name);
    }