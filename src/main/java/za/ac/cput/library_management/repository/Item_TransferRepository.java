package za.ac.cput.library_management.repository;
/*
    Item_Transfer.repository.java
    Lana Africa (216166640)
    Capstone Project - Repository
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.library_management.domain.Item_Transfer;

public interface Item_TransferRepository extends JpaRepository<Item_Transfer, String> {
}
