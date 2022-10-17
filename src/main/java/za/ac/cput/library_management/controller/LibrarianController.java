package za.ac.cput.library_management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.library_management.api.LibrarianAPI;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    private LibrarianAPI librarianAPI;

    @Autowired LibrarianController (LibrarianAPI librarianAPI) {
        this.librarianAPI = librarianAPI;
    }

}
