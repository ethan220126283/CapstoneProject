package za.ac.cput.library_management.service;

public interface IService<T, ID> {
    public  T save(T t);
    public T read(ID id);
    public boolean delete(ID id);
}
