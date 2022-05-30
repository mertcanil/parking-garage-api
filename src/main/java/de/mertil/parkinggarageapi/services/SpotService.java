package de.mertil.parkinggarageapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import de.mertil.parkinggarageapi.models.Spot;
import de.mertil.parkinggarageapi.repositorys.SpotRepository;

public class SpotService {
	
	private final SpotRepository spotRepository;
	
	@Autowired
	public SpotService(SpotRepository spotRepository) {
		this.spotRepository = spotRepository;
	}
	
	public List<Spot> getSpots() {
		return this.spotRepository.findAll();
	}
	
	public Optional<Spot> getSpot(Long id) {
		return this.spotRepository.findById(id);
	}
	
	public void addSpot(Spot spot) {
		this.spotRepository.save(spot);
	}
	
	public void deleteSpot(Long id) {
		this.spotRepository.deleteById(id);
	}

}
