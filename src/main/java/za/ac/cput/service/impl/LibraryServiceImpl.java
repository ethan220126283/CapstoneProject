package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Library;
import za.ac.cput.repository.LibraryRepository;
import za.ac.cput.service.LibraryService;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LibraryServiceImpl implements LibraryService {

    private LibraryRepository repository;

    @Autowired LibraryServiceImpl(LibraryRepository repository) {this.repository = repository;}


    @Override
    public Library save(Library library) {return this.repository.save(library);}

    @Override
    public Library read(String id) { return this.repository.findById(id).orElse(null); }

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Set<Library> getAll() {return this.repository.findAll().stream().collect(Collectors.toSet());}
}
