package za.ac.cput.library_management.service;

/*   Name:       Ethan Christopher Swart
 *   Student#:   220126283
 *   Date:       22/09/2022
 */

public interface IService<T, ID> {
    public  T save(T t);
    public T read(ID id);
    public boolean delete(ID id);
}
