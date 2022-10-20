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

    //Get all members
    public List<Item> getItem(){
        return itemService.getAll();
    }

    //Get by members name
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

    //Get members by ID
    public Item getItemsById(String id){
        return itemService.read(id);
    }

    public void addItems(String id, String name, String author, String genre, String status){
        Item item = ItemFactory.createItem(id,name,author,genre,status);
        itemService.save(item);
    }

    //Delete members by id
    public Boolean deleteItemsById(String id){
        return itemService.delete(id);

    }

    //Return Object[][]
    public Object[][] getItemsTable() {

        List<Item> items = getItem();
        Object[][] data;

        /*for (int i = 0; i < items.size(); i++) {
            data.
        }*/

        return null;
    }


}
