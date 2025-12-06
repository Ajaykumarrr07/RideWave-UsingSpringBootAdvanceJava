package com.alpha.DemoRideWave.Entities;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;


@Entity
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sourcelocation;
	private String destinationlocation;
	private String distancetravelled;
	private String fare;
	private String estimationtimerequired;
	private int bookingdate;
// private Payment payment;
	@ManyToOne
	
	@JoinColumn(name="customer_id")
	@JsonBackReference(value = "customer-booking")
	private Customer cust;
	
	@ManyToOne

	@JoinColumn(name="driver_id")
	@JsonBackReference(value = "driver-booking")
	private DriverEn driver;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSourcelocation() {
		return sourcelocation;
	}
	public void setSourcelocation(String sourcelocation) {
		this.sourcelocation = sourcelocation;
	}
	public String getDestinationlocation() {
		return destinationlocation;
	}
	public void setDestinationlocation(String destinationlocation) {
		this.destinationlocation = destinationlocation;
	}
	public String getDistancetravelled() {
		return distancetravelled;
	}
	public void setDistancetravelled(String distancetravelled) {
		this.distancetravelled = distancetravelled;
	}
	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
	public String getEstimationtimerequired() {
		return estimationtimerequired;
	}
	public void setEstimationtimerequired(String estimationtimerequired) {
		this.estimationtimerequired = estimationtimerequired;
	}
	public int getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(int bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public DriverEn getDriver() {
		return driver;
	}
	public void setDriver(DriverEn driver) {
		this.driver = driver;
	}
	public Booking( String sourcelocation, String destinationlocation, String distancetravelled, String fare,
			String estimationtimerequired, int bookingdate, Customer cust, DriverEn driver) {
		super();
	
		this.sourcelocation = sourcelocation;
		this.destinationlocation = destinationlocation;
		this.distancetravelled = distancetravelled;
		this.fare = fare;
		this.estimationtimerequired = estimationtimerequired;
		this.bookingdate = bookingdate;
		this.cust = cust;
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", sourcelocation=" + sourcelocation + ", destinationlocation="
				+ destinationlocation + ", distancetravelled=" + distancetravelled + ", fare=" + fare
				+ ", estimationtimerequired=" + estimationtimerequired + ", bookingdate=" + bookingdate + ", cust="
				+ cust + ", driver=" + driver + "]";
	}
	public Booking() {
		super();
	}
	
	
	
	
	
}
