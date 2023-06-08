package acustic.assembling_company.repository;

import acustic.assembling_company.entity.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISuppliersRepository extends JpaRepository<Suppliers, Long> {
}
