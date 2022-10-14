package za.ac.cput.library_management.service;

/*   Name:       Mogammad Faeedh Daniels
 *   Student#:   219174288
 *   LibrarianService.java
 */

import za.ac.cput.library_management.domain.Librarian;

import java.util.List;

public interface LibrarianService extends IService<Librarian,String>{
    public List<Librarian> getAll();
}
