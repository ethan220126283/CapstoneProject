package za.ac.cput.library_management.service;
/*
    BooklineService.java
    Lana Africa (216166640)
    Capstone Project - Service
*/
import za.ac.cput.library_management.domain.Bookline;

import java.util.List;

public interface BooklineService extends IService<Bookline, String> {
   public List<Bookline> getAll();
}
