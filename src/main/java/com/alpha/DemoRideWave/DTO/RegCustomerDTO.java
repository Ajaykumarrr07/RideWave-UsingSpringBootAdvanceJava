package com.alpha.DemoRideWave.DTO;

public class RegCustomerDTO {
private String name;
private int age;
private String gender;
private long mobno;
private String email;
private double longi;
private double lanti;
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
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getLongi() {
	return longi;
}
public void setLongi(double longi) {
	this.longi = longi;
}
public double getLanti() {
	return lanti;
}
public void setLanti(double lanti) {
	this.lanti = lanti;
}
@Override
public String toString() {
	return "RegCustomerDTO [name=" + name + ", age=" + age + ", gender=" + gender + ", mobno=" + mobno + ", email="
			+ email + ", longi=" + longi + ", lanti=" + lanti + "]";
}
public RegCustomerDTO(String name, int age, String gender, long mobno, String email, double longi, double lanti) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.mobno = mobno;
	this.email = email;
	this.longi = longi;
	this.lanti = lanti;
}
public RegCustomerDTO() {
	super();
}

}
