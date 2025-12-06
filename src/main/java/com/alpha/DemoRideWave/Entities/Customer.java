package com.alpha.DemoRideWave.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private String gender;
	private long mobileno;
	private String email;
	@OneToMany(mappedBy = "cust", cascade = CascadeType.ALL)
	@JsonManagedReference(value = "customer-booking")
	private List<Booking> bookinglist;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Booking> getBookinglist() {
		return bookinglist;
	}
	public void setBookinglist(List<Booking> bookinglist) {
		this.bookinglist = bookinglist;
	}
	public Customer(String name, int age, String gender, long mobileno, String email,
			List<Booking> bookinglist) {
		super();
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileno = mobileno;
		this.email = email;
		this.bookinglist = bookinglist;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mobileno="
				+ mobileno + ", email=" + email + ", bookinglist=" + bookinglist + "]";
	}
	
	
	

}
