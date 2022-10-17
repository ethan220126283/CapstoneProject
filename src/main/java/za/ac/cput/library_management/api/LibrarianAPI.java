package za.ac.cput.library_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Librarian;
import za.ac.cput.library_management.factory.LibrarianFactory;
import za.ac.cput.library_management.service.impl.LibrarianServiceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Component
public class LibrarianAPI {

    private LibrarianServiceImpl librarianService;

    @Autowired
    LibrarianAPI(LibrarianServiceImpl librarianService) {
        this.librarianService = librarianService;
    }

    //Get Names
    public List<String> getLibrarianNames() {

        List<Librarian> librarians = librarianService.getAll();
        List<String> names = new LinkedList<>();

        for (Librarian librarian : librarians) {names.add(librarian.getName());}

        if (names.isEmpty()) {return null;}
        else {return names;}
    }

    //Get All
    public List<Librarian> getLibrarians() {return librarianService.getAll();}

    //Add librarian to DB
    public void addLibrarian(String id, String name, String address, String tel, char[] password) {
        Librarian librarian = LibrarianFactory.createLibrarian(id, name, address, tel, password);
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
}
