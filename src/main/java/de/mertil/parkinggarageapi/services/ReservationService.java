package de.mertil.parkinggarageapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.mertil.parkinggarageapi.models.Reservation;
import de.mertil.parkinggarageapi.repositorys.ReservationRepository;

@Service
public class ReservationService {
	
	private final ReservationRepository reservationRepository;

	@Autowired
	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	public List<Reservation> getReservations() {
		return this.reservationRepository.findAll();
	}
	
	public Optional<Reservation> getReservation(Long id) {
		return this.reservationRepository.findById(id);
	}
	
	public void addReservation(Reservation reservation) {
		this.reservationRepository.save(reservation);
	}
	
	public void deleteReservation(Long id) {
		this.reservationRepository.deleteById(id);
	}

}
