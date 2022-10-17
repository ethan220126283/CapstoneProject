package za.ac.cput.library_management.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.factory.ItemFactory;
import za.ac.cput.library_management.service.impl.ItemServiceImpl;
import java.util.LinkedList;
import java.util.List;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
@Component
public class ItemAPI {

    private ItemServiceImpl itemService;

    @Autowired
    ItemAPI(ItemServiceImpl itemService)
    {
        this.itemService = itemService;
    }

    //getItems() //returns List
    public List<String> getName() {

        List<Item> items = itemService.getAll();
        List<String> names = new LinkedList<>();

        for (Item item : items)
        {
            names.add(item.getName());
        }

        if (names.isEmpty())
        {
            return null;
        } else
        {
            return names;
        }
    }

    //getItemsByName(String name) //returns List
    public List<Item> getItem()
    {
        return itemService.getAll();
    }

    //addItem(Item item) //void
    public void save(String id, String name, String author, String genre, String status) {
        Item item = ItemFactory.createItem(id, name, author, genre,status);
        itemService.save(item);
    }

    //deleteItem(String id) //returns boolean
    public Boolean deleteById(String id)
    {
        return itemService.delete(id);
    }

    //getItemById(String id) // returns Item
    public Item getId(String id){
        return itemService.read(id);
    }


}
