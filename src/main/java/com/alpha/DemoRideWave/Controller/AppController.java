package com.alpha.DemoRideWave.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.DemoRideWave.ResponceStructure;
import com.alpha.DemoRideWave.DTO.CurrentLocationDTO;
import com.alpha.DemoRideWave.DTO.RegDriverVehicleDTO;
import com.alpha.DemoRideWave.Entities.Customer;
import com.alpha.DemoRideWave.Entities.DriverEn;
import com.alpha.DemoRideWave.Entities.Vehicle;
import com.alpha.DemoRideWave.Service.CustamerService;
import com.alpha.DemoRideWave.Service.DriverService;

@RestController
public class AppController {
    @Autowired
	private DriverService dr;
    
    @Autowired
    private CustamerService custamerService;
    
    @PostMapping("/savedDriver")
    public void driverSave(@RequestBody DriverEn d) {
    	 dr.saveDriver(d);
    }
	
    @GetMapping("/finddriver")
    public ResponceStructure<DriverEn> findDriver(@RequestParam long mobileno) {
        return dr.findDriver(mobileno);
    }
    
    @DeleteMapping("/deletedriver")
    public void deleteDriver(@RequestParam long mobileno) {
    	dr.deleteDriver(mobileno);
    }
    
    
    
    @PostMapping("/registerdriver")
	public ResponceStructure<String> registerDriver(@RequestBody RegDriverVehicleDTO dto) {
		return dr.registerDriver(dto);
	}
    
    @PutMapping("/updatecurrentVehiclelocation")
    public ResponceStructure<Vehicle> updatecurrentVehiclelocation(@RequestParam long mob, @RequestBody CurrentLocationDTO cuulo) {
    	return dr.updateCurrentLocation(mob,cuulo);
    }
    
   //--------------------------------Customer--------------
    @PostMapping("/savedCustomer")
    public void saveCustomer(@RequestBody Customer cus) {
    	custamerService.saveDriver(cus);
    }
    
    @GetMapping("/findCustomer")
    public ResponceStructure<Customer> findCustomer(@RequestParam long mobileno) {
        return custamerService.findCustomer(mobileno);
    }
    
    
    @DeleteMapping("/deletecustomer")
    public void deleteCustomer(@RequestParam long mobileno) {
    	 custamerService.deleteCustomer(mobileno);
    }
    
    @GetMapping("/seeAllAvailablevehicle")
    public ResponceStructure<List<Vehicle>> seeAllAvailablevehicle(@RequestParam long mobileno) {

         return custamerService.seeAllAvailablevehicle(mobileno);
    }
    
    
    
    
    
}
