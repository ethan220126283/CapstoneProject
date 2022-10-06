package za.ac.cput.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.library_management.domain.Item_Transfer;

@Repository
public interface Item_TransferRepository extends JpaRepository<Item_Transfer, String> {
}