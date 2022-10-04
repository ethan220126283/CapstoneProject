package za.ac.cput.library_management.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "za.ac.cput.library_management")
public class LibraryManagementApplication {
    public static void main(String[] args) { SpringApplication.run(LibraryManagementApplication.class, args);}
}
