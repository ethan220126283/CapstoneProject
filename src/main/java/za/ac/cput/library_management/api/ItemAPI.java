package za.ac.cput.library_management.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Member;
import za.ac.cput.library_management.factory.ItemFactory;
import za.ac.cput.library_management.service.impl.ItemServiceImpl;

import java.util.List;
import java.util.Objects;

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

    //Get all items
    public List<Item> getItem(){
        return itemService.getAll();
    }

    //Get by items name
    public Item getItemsByName(String name) {

        List<Item> items = itemService.getAll();
        Item result = null;

        for(Item item : items ){

            if(Objects.equals(item.getName(),name)){
                result = item;
            }
        }
        return result;
    }

    //Get items by ID
    public Item getItemsById(String id){
        return itemService.read(id);
    }

    public void addItems(String id, String name, String author, String genre, String status){
        Item item = ItemFactory.createItem(id,name,author,genre,status);
        itemService.save(item);
    }

    //Delete items by id
    public Boolean deleteItemsById(String id){
        return itemService.delete(id);

    }

    //Return Object[][]
    public Object[][] getItemsTable() {

        List<Item> items = getItem();
        Object[][] objects = new Object[items.size()][4];

        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if (item == null) {
                objects[i] = null;
            } else {
                objects[i][0] = item.getId();
                objects[i][1] = item.getName();
                objects[i][2] = item.getAuthor();
                objects[i][3] = item.getGenre();
                objects[i][4] = item.getStatus();
            }
        }
        return objects;
    }
}
