package com.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.model.Seat;
import com.com.repository.SeatRepository;

@Service
public class SeatService {
    
    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getAvailableSeats() {
        return seatRepository.findByIsAvailable(true);
    }
}