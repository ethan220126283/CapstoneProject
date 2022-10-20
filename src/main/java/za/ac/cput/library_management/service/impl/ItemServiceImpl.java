package za.ac.cput.library_management.service.impl;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       05/10/2022
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.repository.ItemRepository;
import za.ac.cput.library_management.repository.LibraryRepository;
import za.ac.cput.library_management.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository repository;

    @Autowired
    ItemServiceImpl(ItemRepository repository) {this.repository = repository;}

    @Override
    public Item save(Item item) {return this.repository.save(item);}

    @Override
    public Item read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public List<Item> getAll() { return this.repository.findAll().stream().collect(Collectors.toList());}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
