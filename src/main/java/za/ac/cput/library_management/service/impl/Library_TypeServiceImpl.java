package za.ac.cput.library_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.domain.Library_Type;
import za.ac.cput.library_management.repository.LibraryRepository;
import za.ac.cput.library_management.repository.Library_TypeRepository;
import za.ac.cput.library_management.service.Library_TypeService;

@Service
public class Library_TypeServiceImpl implements Library_TypeService {

    private Library_TypeRepository repository;

    @Autowired
    Library_TypeServiceImpl(Library_TypeRepository repository) {this.repository = repository;}

    @Override
    public Library_Type save(Library_Type library_type) {return this.repository.save(library_type);}

    @Override
    public Library_Type read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
