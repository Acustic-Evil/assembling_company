package acustic.assembling_company.repository;

import acustic.assembling_company.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientsRepository extends JpaRepository<Clients, Long> {
}
