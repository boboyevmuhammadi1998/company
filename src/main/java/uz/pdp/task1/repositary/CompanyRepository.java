package uz.pdp.task1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task1.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
