package com.alpha.DemoRideWave.Ripositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.alpha.DemoRideWave.Entities.DriverEn;


@Repository
public interface DriverRepo extends JpaRepository<DriverEn, Integer>{

	public Optional<DriverEn> findByMobileno(long mobileno);
	public void deleteByMobileno(long mobileno);
}
