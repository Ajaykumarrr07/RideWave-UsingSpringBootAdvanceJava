package com.alpha.DemoRideWave.Ripositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.DemoRideWave.Entities.Vehicle;


@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer>{

	public List<Vehicle> findByAvailablestatus(String string);

}
