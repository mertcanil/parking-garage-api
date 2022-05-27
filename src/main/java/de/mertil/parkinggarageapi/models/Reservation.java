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
	private Long spotId;
	private LocalDateTime start;
	private LocalDateTime end;
	private boolean paid;
	
	public Reservation() {}

	public Reservation(Long id, Long spotId, LocalDateTime start, LocalDateTime end, boolean paid) {
		super();
		this.id = id;
		this.spotId = spotId;
		this.start = start;
		this.end = end;
		this.paid = paid;
	}

	public Reservation(Long spotId, LocalDateTime start, LocalDateTime end, boolean paid) {
		this.spotId = spotId;
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

	public Long getSpotId() {
		return spotId;
	}

	public void setSpotId(Long spotId) {
		this.spotId = spotId;
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
