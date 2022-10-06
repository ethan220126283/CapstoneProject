package za.ac.cput.library_management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Library_Item;
import za.ac.cput.library_management.repository.Library_ItemRepository;
import za.ac.cput.library_management.service.Library_ItemService;

@Service
public class Library_ItemServiceImpl implements Library_ItemService {

    private Library_ItemRepository repository;

    @Autowired Library_ItemServiceImpl(Library_ItemRepository repository) {this.repository = repository;}
    @Override
    public Library_Item save(Library_Item library_item) {return this.repository.save(library_item);}

    @Override
    public Library_Item read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
