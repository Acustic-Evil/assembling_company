package acustic.assembling_company.repository;

import acustic.assembling_company.entity.Assembles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAssemblesRepository extends JpaRepository<Assembles, Long> {
}
