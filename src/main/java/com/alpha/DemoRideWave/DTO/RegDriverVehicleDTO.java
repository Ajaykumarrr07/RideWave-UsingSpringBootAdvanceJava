package com.alpha.DemoRideWave.DTO;

public class RegDriverVehicleDTO {
private String licNo;
private int upiid;
private String dname;
private int age;
private long mobNo;
private String gender;
private String mailid;

private String vname;
private String vehno;
private String vtype;
private String vmodel;
private int vcapacity;
private double logi;
private double lati;
private int priceperkm;
public String getLicNo() {
	return licNo;
}
public void setLicNo(String licNo) {
	this.licNo = licNo;
}
public int getUpiid() {
	return upiid;
}
public void setUpiid(int upiid) {
	this.upiid = upiid;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getMobNo() {
	return mobNo;
}
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public String getVname() {
	return vname;
}
public void setVname(String vname) {
	this.vname = vname;
}
public String getVehno() {
	return vehno;
}
public void setVehno(String vehno) {
	this.vehno = vehno;
}
public String getVtype() {
	return vtype;
}
public void setVtype(String vtype) {
	this.vtype = vtype;
}
public String getVmodel() {
	return vmodel;
}
public void setVmodel(String vmodel) {
	this.vmodel = vmodel;
}
public int getVcapacity() {
	return vcapacity;
}
public void setVcapacity(int vcapacity) {
	this.vcapacity = vcapacity;
}
public double getLogi() {
	return logi;
}
public void setLogi(double logi) {
	this.logi = logi;
}
public double getLati() {
	return lati;
}
public void setLati(double lati) {
	this.lati = lati;
}
public int getPriceperkm() {
	return priceperkm;
}
public void setPriceperkm(int priceperkm) {
	this.priceperkm = priceperkm;
}
public RegDriverVehicleDTO(String licNo, int upiid, String dname, int age, long mobNo, String gender, String mailid,
		String vname, String vehno, String vtype, String vmodel, int vcapacity, double logi, double lati,
		int priceperkm) {
	super();
	this.licNo = licNo;
	this.upiid = upiid;
	this.dname = dname;
	this.age = age;
	this.mobNo = mobNo;
	this.gender = gender;
	this.mailid = mailid;
	this.vname = vname;
	this.vehno = vehno;
	this.vtype = vtype;
	this.vmodel = vmodel;
	this.vcapacity = vcapacity;
	this.logi = logi;
	this.lati = lati;
	this.priceperkm = priceperkm;
}
@Override
public String toString() {
	return "RegDriverVehicleDTO [licNo=" + licNo + ", upiid=" + upiid + ", dname=" + dname + ", age=" + age + ", mobNo="
			+ mobNo + ", gender=" + gender + ", mailid=" + mailid + ", vname=" + vname + ", vehno=" + vehno + ", vtype="
			+ vtype + ", vmodel=" + vmodel + ", vcapacity=" + vcapacity + ", logi=" + logi + ", lati=" + lati
			+ ", priceperkm=" + priceperkm + "]";
}
public RegDriverVehicleDTO() {
	super();
}




}
