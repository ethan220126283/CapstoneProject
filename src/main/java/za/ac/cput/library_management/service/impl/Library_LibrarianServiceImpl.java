package za.ac.cput.library_management.service.impl;

/*   Name:       Mogammad Faeedh Daniels
 *   Student#:   219174288
 *   Library_LibrarianServiceImpl.java
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Library_Librarian;
import za.ac.cput.library_management.repository.Library_LibrarianRepository;
import za.ac.cput.library_management.service.Library_LibrarianService;

@Service
public class Library_LibrarianServiceImpl implements Library_LibrarianService {

    private Library_LibrarianRepository repository;

    @Autowired
    Library_LibrarianServiceImpl(Library_LibrarianRepository repository){this.repository = repository;}


    @Override
    public Library_Librarian save(Library_Librarian LL) {
        return this.repository.save(LL);
    }

    @Override
    public Library_Librarian read(String id) {
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
