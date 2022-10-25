package za.ac.cput.library_management.service.impl;
/*
    BooklineServiceImpl.java
    Lana Africa (216166640)
    Capstone Project - Service Implementation
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Bookline;
import za.ac.cput.library_management.repository.BooklineRepository;
import za.ac.cput.library_management.service.BooklineService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BooklineServiceImpl implements BooklineService {

    private final BooklineRepository repository;

    @Autowired
    BooklineServiceImpl(BooklineRepository repository) {
        this.repository = repository;
    }
    @Override
    public Bookline save(Bookline bookline) {
        return this.repository.save(bookline);
    }

    @Override
    public Bookline read(String id) {
        return this.repository.findById(id).orElse(null);
    }
    @Override
    public List<Bookline> getAll() { return this.repository.findAll().stream().collect(Collectors.toList());}
    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
