package za.ac.cput.library_management.service.impl;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       05/10/2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.repository.LibraryRepository;
import za.ac.cput.library_management.service.LibraryService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LibraryServiceImpl implements LibraryService {

    private LibraryRepository repository;

    @Autowired LibraryServiceImpl(LibraryRepository repository) {this.repository = repository;}

    @Override
    public Library save(Library library) {return this.repository.save(library);}

    @Override
    public Library read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public List<Library> getAll() { return this.repository.findAll().stream().collect(Collectors.toList());}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
