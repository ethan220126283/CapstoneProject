package za.ac.cput.library_management.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Type;
import za.ac.cput.library_management.repository.TypeRepository;
import za.ac.cput.library_management.service.TypeService;
/*   Name:       Darryll Merkeur
 *   Student#:   220253595
 *   Date:       21/09/2022
 */
@Service
public class TypeServiceImpl implements TypeService {
    private TypeRepository repository;
    @Autowired
    TypeServiceImpl(TypeRepository repository)
    {this.repository = repository;}

    @Override
    public Type save(Type type)
    {return this
            .repository
            .save(type);}

    @Override
    public Type read(String id)
    {return this.repository
            .findById(id)
            .orElse(null);}

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
