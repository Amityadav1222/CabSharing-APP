package com.carride.bikeride.Service;

import com.carride.bikeride.Module.Ride;
import com.carride.bikeride.Repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    @Autowired
    private RideRepository rideRepository;

    public Ride createRide(Ride ride) {
        // Logic for creating a ride
        return rideRepository.save(ride);
    }

    public Ride getRideById(Long rideId) {
        // Logic to retrieve a ride by ID
        return rideRepository.findById(rideId).orElse(null);
    }

    // Other ride-related methods
}

