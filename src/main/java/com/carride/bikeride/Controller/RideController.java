package com.carride.bikeride.Controller;

import com.carride.bikeride.Module.Ride;
import com.carride.bikeride.Service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideController {
    @Autowired
    private RideService rideService;

    @PostMapping("/riding")
    public ResponseEntity<Object> createRide(@RequestBody Ride ride) {
        Ride createdRide = rideService.createRide(ride);
        return new ResponseEntity<>(createdRide, HttpStatus.CREATED);
    }

    @GetMapping("/rideId")
    public ResponseEntity<Ride> getRideById(@PathVariable Long rideId) {
        Ride ride = rideService.getRideById(rideId);
        if (ride == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(ride, HttpStatus.OK);
    }

    // Other ride-related endpoints
    @GetMapping

    public ResponseEntity<Object> getAllRides(){
        List<Ride> ride =   rideService.getAllRides();
        return new ResponseEntity<Object>(ride, HttpStatus.OK);

    }
}

