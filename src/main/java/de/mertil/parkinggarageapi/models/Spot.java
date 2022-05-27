package de.mertil.parkinggarageapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Spot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private VehicleType vehicleType;
	private Status status;
	
	public Spot() {}

	public Spot(Long id, VehicleType vehicleType, Status status) {
		this.id = id;
		this.vehicleType = vehicleType;
		this.status = status;
	}

	public Spot(VehicleType vehicleType, Status status) {
		this.vehicleType = vehicleType;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

}
