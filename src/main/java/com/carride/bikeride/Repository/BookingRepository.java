package com.carride.bikeride.Repository;

import com.carride.bikeride.Module.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface BookingRepository extends JpaRepository<Booking, Long> {

    // Additional methods for booking management if needed
}

