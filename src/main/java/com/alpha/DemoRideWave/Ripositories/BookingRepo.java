package com.alpha.DemoRideWave.Ripositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.DemoRideWave.Entities.Booking;
@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
