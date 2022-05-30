package de.mertil.parkinggarageapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.mertil.parkinggarageapi.models.Reservation;
import de.mertil.parkinggarageapi.services.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	private final ReservationService reservationService;
	
	@Autowired
	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping
	public List<Reservation> getReservations() {
		return this.reservationService.getReservations();
	}
	
	@GetMapping
	public Optional<Reservation> getReservation(@RequestBody Long id) {
		return this.reservationService.getReservation(id);
	}

}
