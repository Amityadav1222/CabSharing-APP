package com.carride.bikeride.Service;

import com.carride.bikeride.Module.Booking;
import com.carride.bikeride.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking bookRide(Booking booking) {
        // Logic for booking a ride
        return bookingRepository.save(booking);
    }

    // Other booking-related methods
}

