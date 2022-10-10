package za.ac.cput.library_management.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.cput.library_management.domain.Library;
import za.ac.cput.library_management.service.LibraryService;
import za.ac.cput.library_management.service.impl.LibraryServiceImpl;

import java.util.LinkedList;
import java.util.List;

@Component
public class LibraryAPI {

    private LibraryServiceImpl libraryService;

    @Autowired
    LibraryAPI(LibraryServiceImpl libraryService) {
        this.libraryService = libraryService;
    }

}
