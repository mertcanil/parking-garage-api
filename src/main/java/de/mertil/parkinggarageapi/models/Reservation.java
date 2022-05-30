package de.mertil.parkinggarageapi.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "reservation")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Spot spot;
	private LocalDateTime start;
	private LocalDateTime end;
	private boolean paid;
	
	public Reservation() {}

	public Reservation(Long id, Spot spot, LocalDateTime start, LocalDateTime end, boolean paid) {
		this.id = id;
		this.spot = spot;
		this.start = start;
		this.end = end;
		this.paid = paid;
	}

	public Reservation(Spot spot, LocalDateTime start, LocalDateTime end, boolean paid) {
		this.spot = spot;
		this.start = start;
		this.end = end;
		this.paid = paid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Spot getSpot() {
		return spot;
	}

	public void setSpot(Spot spot) {
		this.spot = spot;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

}
