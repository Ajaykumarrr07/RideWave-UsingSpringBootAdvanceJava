package com.alpha.DemoRideWave.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.DemoRideWave.ResponceStructure;
import com.alpha.DemoRideWave.Entities.Customer;
import com.alpha.DemoRideWave.Entities.Vehicle;
import com.alpha.DemoRideWave.ExceptionHandler.CustomerNotFoundException;
import com.alpha.DemoRideWave.ExceptionHandler.VehicleNotFoundException;
import com.alpha.DemoRideWave.Ripositories.BookingRepo;
import com.alpha.DemoRideWave.Ripositories.CustomerRepo;
import com.alpha.DemoRideWave.Ripositories.VehicleRepo;

@Service
public class CustamerService {
@Autowired
private CustomerRepo crepo;

@Autowired
private BookingRepo Borepo;

@Autowired
private VehicleRepo vehicleRepo;

public Customer saveDriver(Customer cus) {
	if (cus.getBookinglist() != null) {
        cus.getBookinglist().forEach(b -> b.setCust(cus));
    }

    return crepo.save(cus);
	
	
}



public ResponceStructure<Customer> findCustomer(long mobileno) {
	Customer cus=crepo.findByMobileno(mobileno).orElseThrow(()->new CustomerNotFoundException());
	ResponceStructure<Customer> rc=new ResponceStructure<Customer>();
	rc.setStatusCode(HttpStatus.FOUND.value());
	rc.setMessage("CUSTOMER WITH MOB NO: "+mobileno+"FOUND");
	rc.setData(cus);
	
	return rc;
}



public ResponceStructure<Customer> deleteCustomer(long mobileno) {
	// TODO Auto-generated method stub
	 Customer d = crepo.findByMobileno(mobileno)
	            .orElseThrow(() -> new CustomerNotFoundException());

	 crepo.delete(d);
    ResponceStructure<Customer> rde=new ResponceStructure<Customer>();
     rde.setStatusCode(HttpStatus.FOUND.value());
     rde.setMessage("CUSTOMER WITH MOB NO: "+mobileno+"FOUND");
     rde.setData(d);
     return rde;
	 
	 
}

public ResponceStructure<List<Vehicle>> seeAllAvailablevehicle(long mobileno) {
	 Customer d = crepo.findByMobileno(mobileno)
	            .orElseThrow(() -> new CustomerNotFoundException());
	 List<Vehicle> vehicles = vehicleRepo.findByAvailablestatus("available");

	   
	    if (vehicles.isEmpty()) {
	        throw new VehicleNotFoundException();
	    }

	   
	    ResponceStructure<List<Vehicle>> response = new ResponceStructure<>();
	    response.setStatusCode(HttpStatus.OK.value());
	    response.setMessage("Available vehicles fetched successfully");
	    response.setData(vehicles);

	    return response;
	 
}





	
}
