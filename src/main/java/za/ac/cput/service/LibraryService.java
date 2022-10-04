package za.ac.cput.service;

import za.ac.cput.domain.Library;
import java.util.Set;

public interface LibraryService extends IService<Library, String> {
    public Set<Library> getAll();
}
