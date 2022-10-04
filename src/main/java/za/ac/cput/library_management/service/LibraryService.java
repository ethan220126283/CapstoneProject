package za.ac.cput.library_management.service;

import za.ac.cput.library_management.domain.Library;

import java.util.Set;

public interface LibraryService extends IService<Library, String> {
    public Set<Library> getAll();
}
