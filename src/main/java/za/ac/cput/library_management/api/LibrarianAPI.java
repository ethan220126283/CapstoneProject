package za.ac.cput.library_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.factory.LibrarianFactory;
import za.ac.cput.library_management.service.impl.LibrarianServiceImpl;

import java.util.List;
import java.util.Objects;

@Component
public class LibrarianAPI {

    private LibrarianServiceImpl librarianService;

    @Autowired
    LibrarianAPI(LibrarianServiceImpl librarianService) {
        this.librarianService = librarianService;
    }

    //Find librarian by id
    public Librarian getLibrarianById(String id) {
        return librarianService.read(id);
    }

    //Get All
    public List<Librarian> getLibrarians() {return librarianService.getAll();}

    //Add librarian to DB
    public void addLibrarian(Librarian librarian) {
        librarianService.save(librarian);
    }

    //Remove librarian from DB
    public Boolean deleteLibrarianById(String id) {
        return librarianService.delete(id);
    }

    //Find librarian by name
    public Librarian getLibrarianByName(String name) {
        List<Librarian> librarians = librarianService.getAll();
        Librarian result = null;

        for (Librarian librarian : librarians) {if (Objects.equals(librarian.getName(), name)) {result = librarian;}}

        return result;
    }

    //Return Object[][]
    public Object[][] getLibrariansTable() {

        List<Librarian> librarians = librarianService.getAll();
        String[] array;
        Object[][] objects = new Object[librarians.size()][5];

        for (int i = 0; i < librarians.size(); i++) {
            Librarian librarian = librarians.get(i);
            if (librarian == null) {
                objects[i] = null;
            }
            else {
                objects[i][0] = librarian.getId();
                objects[i][1] = librarian.getName();
                objects[i][2] = librarian.getAddress();
                objects[i][3] = librarian.getTel();
                objects[i][4] = librarian.getPassword();
            }
        }

        return objects;
    }
}
