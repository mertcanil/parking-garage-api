package de.mertil.parkinggarageapi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import de.mertil.parkinggarageapi.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
