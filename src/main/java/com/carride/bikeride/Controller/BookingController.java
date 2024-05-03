package com.carride.bikeride.Controller;

import com.carride.bikeride.Module.Booking;
import com.carride.bikeride.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookride")
    public ResponseEntity<Booking> bookRide(@RequestBody Booking booking) {
        Booking bookedRide = bookingService.bookRide(booking);
        return new ResponseEntity<>(bookedRide, HttpStatus.CREATED);
    }

    // Other booking-related endpoints
}

