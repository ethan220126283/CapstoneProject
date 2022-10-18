package za.ac.cput.library_management.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.library_management.api.ItemAPI;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
@RestController
@RequestMapping("/librarian")
public class ItemController {
    private ItemAPI itemAPI;

    @Autowired
    ItemController (ItemAPI itemAPI) {
        this.itemAPI = itemAPI;
    }
}
