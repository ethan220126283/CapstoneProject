package za.ac.cput.library_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.library_management.api.LibraryAPI;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private LibraryAPI libraryAPI;

    @Autowired LibraryController (LibraryAPI libraryAPI) {
        this.libraryAPI = libraryAPI;
    }

}
