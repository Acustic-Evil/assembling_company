package acustic.assembling_company.repository;

import acustic.assembling_company.entity.ComponentPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComponentPurchase extends JpaRepository<ComponentPurchase, Long> {
}
