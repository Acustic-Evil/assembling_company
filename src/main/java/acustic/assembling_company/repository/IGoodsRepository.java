package acustic.assembling_company.repository;

import acustic.assembling_company.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGoodsRepository extends JpaRepository<Goods, Long> {
}
