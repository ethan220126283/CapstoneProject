package za.ac.cput.library_management.service;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       05/10/2022
 */

import za.ac.cput.library_management.domain.Item;
import za.ac.cput.library_management.domain.Librarian;

import java.util.List;

public interface ItemService extends IService<Item, String>{
    public List<Item> getAll();
}
