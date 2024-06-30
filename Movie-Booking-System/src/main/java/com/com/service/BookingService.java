package com.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.model.Booking;
import com.com.model.Seat;
import com.com.repository.BookingRepository;
import com.com.repository.SeatRepository;

@Service
public class BookingService {
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private SeatRepository seatRepository;

    public Booking createBooking(Booking booking) {
        Seat seat = seatRepository.findById(booking.getSeat().getId()).orElseThrow();
        if (!seat.isAvailable()) {
            throw new RuntimeException("Seat not available");
        }
        seat.setAvailable(false);
        seatRepository.save(seat);
        return bookingRepository.save(booking);
    }
}
