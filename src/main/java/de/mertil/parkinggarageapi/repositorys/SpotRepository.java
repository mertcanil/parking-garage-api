package de.mertil.parkinggarageapi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import de.mertil.parkinggarageapi.models.Spot;

public interface SpotRepository extends JpaRepository<Spot, Long> {

}
