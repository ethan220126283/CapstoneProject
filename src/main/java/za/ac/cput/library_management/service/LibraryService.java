package za.ac.cput.library_management.service;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

import za.ac.cput.library_management.domain.Library;

import java.util.List;
import java.util.Set;

public interface LibraryService extends IService<Library, String>{
    public List<Library> getAll();
}
