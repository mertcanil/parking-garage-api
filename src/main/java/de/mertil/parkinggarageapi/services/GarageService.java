package de.mertil.parkinggarageapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import de.mertil.parkinggarageapi.models.Garage;
import de.mertil.parkinggarageapi.repositorys.GarageRepository;

public class GarageService {
	
	private final GarageRepository garageRepository;
	
	@Autowired
	public GarageService(GarageRepository garageRepository) {
		this.garageRepository = garageRepository;
	}
	
	public List<Garage> getGarages() {
		return this.garageRepository.findAll();
	}
	
	public Optional<Garage> getGarage(Long id) {
		return this.garageRepository.findById(id);
	}
	
	public void addGarage(Garage garage) {
		this.garageRepository.save(garage);
	}
	
	public void deleteGarage(Long id) {
		this.garageRepository.deleteById(id);
	}

}
