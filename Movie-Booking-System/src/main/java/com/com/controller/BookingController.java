package com.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.model.Booking;
import com.com.service.BookingService;



@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    
    @Autowired
    private BookingService bookingService;

    @PostMapping("/createBooking")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }
}