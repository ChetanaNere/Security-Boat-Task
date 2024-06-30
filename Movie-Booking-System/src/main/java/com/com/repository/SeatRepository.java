package com.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.model.Seat;
@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>{

	List<Seat> findByIsAvailable(boolean b);

}
