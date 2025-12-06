package com.alpha.DemoRideWave.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	private int id;
	private String name;
	private String vehicleno;
	private String vehicletype;
	private String vehiclemodel;
	private int vehiclecapacity;
	private String currentcity;
	private String availablestatus;
	private int priceperkm;
	private double lati;
	private double logi;
	
	@OneToOne
	@MapsId
	@JoinColumn(name="id")
	@JsonBackReference
	private DriverEn driver;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVehicleno() {
		return vehicleno;
	}


	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}


	public String getVehicletype() {
		return vehicletype;
	}


	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}


	public String getVehiclemodel() {
		return vehiclemodel;
	}


	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}


	public int getVehiclecapacity() {
		return vehiclecapacity;
	}


	public void setVehiclecapacity(int vehiclecapacity) {
		this.vehiclecapacity = vehiclecapacity;
	}


	public String getCurrentcity() {
		return currentcity;
	}


	public void setCurrentcity(String currentcity) {
		this.currentcity = currentcity;
	}


	public String getAvailablestatus() {
		return availablestatus;
	}


	public void setAvailablestatus(String availablestatus) {
		this.availablestatus = availablestatus;
	}


	public int getPriceperkm() {
		return priceperkm;
	}


	public void setPriceperkm(int priceperkm) {
		this.priceperkm = priceperkm;
	}


	public DriverEn getDriver() {
		return driver;
	}


	public void setDriver(DriverEn driver) {
		this.driver = driver;
	}
	
	//--------------------------------------
	public double getLati() {
	    return lati;
	}
	public void setLati(double lati) {
	    this.lati = lati;
	}

	public double getLogi() {
	    return logi;
	}
	public void setLogi(double logi) {
	    this.logi = logi;
	}


	





	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", vehicleno=" + vehicleno + ", vehicletype=" + vehicletype
				+ ", vehiclemodel=" + vehiclemodel + ", vehiclecapacity=" + vehiclecapacity + ", currentcity="
				+ currentcity + ", availablestatus=" + availablestatus + ", priceperkm=" + priceperkm + ", lati=" + lati
				+ ", logi=" + logi + ", driver=" + driver + "]";
	}


	public Vehicle(String name, String vehicleno, String vehicletype, String vehiclemodel, int vehiclecapacity,
			String currentcity, String availablestatus, int priceperkm, double lati, double logi, DriverEn driver) {
		super();
		this.name = name;
		this.vehicleno = vehicleno;
		this.vehicletype = vehicletype;
		this.vehiclemodel = vehiclemodel;
		this.vehiclecapacity = vehiclecapacity;
		this.currentcity = currentcity;
		this.availablestatus = availablestatus;
		this.priceperkm = priceperkm;
		this.lati = lati;
		this.logi = logi;
		this.driver = driver;
	}


	public Vehicle() {
		super();
	}
	 
	 

	
	
}