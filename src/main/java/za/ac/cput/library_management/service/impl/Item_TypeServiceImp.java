package za.ac.cput.library_management.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.library_management.domain.Item_Type;
import za.ac.cput.library_management.repository.Item_TypeRepository;
import za.ac.cput.library_management.service.Item_TypeService;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */

public class Item_TypeServiceImp implements Item_TypeService {
    private Item_TypeRepository repository;
    @Autowired
    Item_TypeServiceImp(Item_TypeRepository repository) {this.repository = repository;}

    @Override
    public Item_Type save(Item_Type item_type)
    {return this
            .repository
            .save(item_type);}

    @Override
    public Item_Type read(String id)
    {return this.repository.
            findById(id).
            orElse(null);}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
