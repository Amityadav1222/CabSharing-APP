package com.carride.bikeride.Repository;

import com.carride.bikeride.Module.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RideRepository extends JpaRepository<Ride, Long> {
    // Additional methods for ride management if needed
}

