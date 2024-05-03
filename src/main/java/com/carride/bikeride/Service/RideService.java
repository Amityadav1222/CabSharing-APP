package com.carride.bikeride.Service;

import com.carride.bikeride.Module.Ride;
import com.carride.bikeride.Repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {
    @Autowired
    private RideRepository rideRepository;

    public Ride createRide(Ride ride) {
        // Logic for creating a ride
//        Ride ride1 = new Ride();
//        ride1.setUserId(ride.getUserId());
//        ride1.setSource(ride.getSource());
//        ride1.setDestination(ride.getDestination());
//        ride1.setFare(ride.getFare());
       return rideRepository.save(ride);
    }

    public Ride getRideById(Long rideId) {
        // Logic to retrieve a ride by ID
        return rideRepository.findById(rideId).orElse(null);
    }

    // Other ride-related methods

    public List<Ride> getAllRides(){
        return rideRepository.findAll();

    }
}

