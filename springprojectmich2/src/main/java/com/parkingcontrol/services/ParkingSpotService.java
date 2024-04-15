package com.parkingcontrol.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.parkingcontrol.models.ParkingSpotModel;
import com.parkingcontrol.repositories.ParkingSpotRepository;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;

    //Create
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
    
    // Validations for Create
	public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}

	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}
	

	// Read - List all
	public Page<ParkingSpotModel> findAll(Pageable pageable) {
		return parkingSpotRepository.findAll(pageable);
	}
	
	// Read - Get one by id
	public Optional<ParkingSpotModel> findById(UUID id) {
		return parkingSpotRepository.findById(id);
	}

	
	// Update
	
	
	// Delete
    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
		parkingSpotRepository.delete(parkingSpotModel);
	}

}
