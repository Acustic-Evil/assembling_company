package acustic.assembling_company.repository;

import acustic.assembling_company.entity.GoodsPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGoodsPurchaseRepository extends JpaRepository<GoodsPurchase, Long> {
}
