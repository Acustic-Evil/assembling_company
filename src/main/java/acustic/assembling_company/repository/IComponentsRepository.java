package acustic.assembling_company.repository;

import acustic.assembling_company.entity.Components;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComponentsRepository extends JpaRepository<Components, Long> {
}
