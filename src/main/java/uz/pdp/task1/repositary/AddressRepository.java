package uz.pdp.task1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task1.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}