package com.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.com.model.Seat;
import com.com.service.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
    
    @Autowired
    private SeatService seatService;

    @GetMapping("/availableSeats")
    public ResponseEntity<List<Seat>> getAvailableSeats() {
        return ResponseEntity.ok(seatService.getAvailableSeats());
    }
}