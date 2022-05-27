package de.mertil.parkinggarageapi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import de.mertil.parkinggarageapi.models.Garage;

public interface GarageRepository extends JpaRepository<Garage, Long> {

}
