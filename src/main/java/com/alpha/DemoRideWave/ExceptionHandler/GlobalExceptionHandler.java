package com.alpha.DemoRideWave.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alpha.DemoRideWave.ResponceStructure;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DriverNotFoundException.class)
	public ResponceStructure<String>  driverNotFoundExhandller(){
		 ResponceStructure<String> rs=new  ResponceStructure<String>();
		 
		 rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setMessage("Student Not Found");
			rs.setData("Student Not Found");
			return rs;
	}
	
	@ExceptionHandler(VehicleNotFoundException.class)
	public ResponceStructure<String>  vehiclNotFoundExhandller(){
		 ResponceStructure<String> rs=new  ResponceStructure<String>();
		 
		 rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setMessage("Vehicel Not Found");
			rs.setData("Vehicel Not Found");
			return rs;
	}
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponceStructure<String>  customerNotFoundExhandller(){
		 ResponceStructure<String> rs=new  ResponceStructure<String>();
		 
		 rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setMessage("Customer Not Found");
			rs.setData("Customer Not Found");
			return rs;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
