package za.ac.cput.library_management.service.impl;

/*   Name:       Mogammad Faeedh Daniels
 *   Student#:   219174288
 *   LibrarianServiceImpl.java
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.repository.LibrarianRepository;
import za.ac.cput.library_management.service.LibrarianService;

@Service
public class LibrarianServiceImpl implements LibrarianService {

    private LibrarianRepository repository;

    @Autowired
    LibrarianServiceImpl(LibrarianRepository repository){this.repository = repository;}


    @Override
    public Librarian save(Librarian librarian) {
        return this.repository.save(librarian);
    }

    @Override
    public Librarian read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)){
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
