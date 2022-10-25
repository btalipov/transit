package kz.talipov.transit.repositories;


import kz.talipov.transit.models.entities.Hazard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HazardRepository extends JpaRepository<Hazard, Long> {
}
