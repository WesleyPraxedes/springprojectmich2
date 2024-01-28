package com.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkingcontrol.models.ParkingSpotModel;


public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
	
	
}
