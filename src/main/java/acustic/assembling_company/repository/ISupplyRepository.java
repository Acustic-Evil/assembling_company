package acustic.assembling_company.repository;

import acustic.assembling_company.entity.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISupplyRepository extends JpaRepository<Supply, Long> {

}
