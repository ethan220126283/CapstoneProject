package za.ac.cput.library_management.service.impl;
/*
    Item_TransferServiceImpl.java
    Lana Africa (216166640)
    Capstone Project - Service Implementation
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.library_management.domain.Item_Transfer;
import za.ac.cput.library_management.repository.Item_TransferRepository;
import za.ac.cput.library_management.service.Item_TransferService;

@Service
public class Item_TransferServiceImpl implements Item_TransferService {

    private final Item_TransferRepository repository;

    @Autowired
    Item_TransferServiceImpl(Item_TransferRepository repository) {
        this.repository = repository;}

    @Override
    public Item_Transfer save(Item_Transfer item_transfer) {
        return this.repository.save(item_transfer);
    }

    @Override
    public Item_Transfer read(String id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public boolean delete(String id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
}
