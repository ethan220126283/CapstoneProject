package za.ac.cput.library_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import za.ac.cput.library_management.ui.LoginView;
import za.ac.cput.library_management.ui.libraryGUI;

import java.awt.*;

@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {

        var ctx = new SpringApplicationBuilder(libraryGUI.class)
                .headless(false)
                .run(args);

        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(libraryGUI.class);
            ex.setVisible(true);
        });

        /*var ctx = new SpringApplicationBuilder(LoginView.class)
                .headless(false)
                .run(args);

        EventQueue.invokeLater(() -> {
            var ex = ctx.getBean(LoginView.class);
            ex.showGUI();
        });*/

        //SpringApplication.run(LibraryManagementApplication.class, args);


    }

}
