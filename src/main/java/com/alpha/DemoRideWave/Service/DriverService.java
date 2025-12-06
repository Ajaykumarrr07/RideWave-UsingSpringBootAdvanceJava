package com.alpha.DemoRideWave.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.alpha.DemoRideWave.ResponceStructure;
import com.alpha.DemoRideWave.DTO.CurrentLocationDTO;
import com.alpha.DemoRideWave.DTO.RegDriverVehicleDTO;
import com.alpha.DemoRideWave.Entities.Customer;
import com.alpha.DemoRideWave.Entities.DriverEn;
import com.alpha.DemoRideWave.Entities.Vehicle;
import com.alpha.DemoRideWave.Ripositories.DriverRepo;
import com.alpha.DemoRideWave.Ripositories.VehicleRepo;
import com.alpha.DemoRideWave.ExceptionHandler.DriverNotFoundException;


@Service
public class DriverService {
	@Autowired
	private DriverRepo dr;
	@Autowired
	private VehicleRepo vr;

	public DriverEn saveDriver(DriverEn d) {
		if (d.getVehicle() != null) {
            d.getVehicle().setDriver(d); // Set reverse mapping
        }

        return dr.save(d);  // Cascade will save Vehicle automatically
    }

	public ResponceStructure<DriverEn> findDriver(long mob) {

		DriverEn d=dr.findByMobileno(mob).orElseThrow(()->new DriverNotFoundException());
		ResponceStructure<DriverEn> rs=new ResponceStructure<DriverEn>();
		rs.setStatusCode(HttpStatus.FOUND.value());
		rs.setMessage("Driver with Mobile Number " + mob + " Found");
		rs.setData(d);
		return rs;
	}

	public ResponceStructure<String> deleteDriver(long mobileno) {
	    DriverEn d = dr.findByMobileno(mobileno)
	            .orElseThrow(() -> new DriverNotFoundException());

	    dr.delete(d);

	    ResponceStructure<String> rs = new ResponceStructure<>();
	    rs.setStatusCode(200);
	    rs.setMessage("Driver deleted successfully");
	    rs.setData("Deleted Driver Mobile No: " + mobileno);
	    return rs;
	}
	
	
	
	public ResponceStructure<String> registerDriver(RegDriverVehicleDTO dto) {

		DriverEn driver = new DriverEn();
		driver.setLicenceno(dto.getLicNo());
		driver.setUpiid(dto.getUpiid());
		driver.setName(dto.getDname());
		driver.setAge(dto.getAge());
		driver.setMobileno(dto.getMobNo());
		driver.setGender(dto.getGender());
		driver.setMailid(dto.getMailid());
		driver.setStatus("Available");

		Vehicle veh = new Vehicle();
		veh.setName(dto.getVname());
		veh.setVehicleno(dto.getVehno());
		veh.setVehicletype(dto.getVtype());
		veh.setVehiclemodel(dto.getVmodel());
		veh.setVehiclecapacity(dto.getVcapacity());
		veh.setAvailablestatus("Available");
		veh.setPriceperkm(dto.getPriceperkm());

		driver.setVehicle(veh);
		veh.setDriver(driver);

		dr.save(driver); // cascade saves Vehicle also

		ResponceStructure<String> rs = new ResponceStructure<>();
		rs.setStatusCode(HttpStatus.CREATED.value());
		rs.setMessage("Driver and Vehicle Registered Successfully");
		rs.setData("Saved Mobile No: " + driver.getMobileno());
		return rs;
	}

	public ResponceStructure<Vehicle> updateCurrentLocation(long mob, CurrentLocationDTO cuulo) {
		// TODO Auto-generated method stub
		DriverEn driver = dr.findByMobileno(mob)
	            .orElseThrow(() -> new DriverNotFoundException());
		Vehicle v=driver.getVehicle();
		v.setLati(cuulo.getLatitude());
		v.setLogi(cuulo.getLongitude());
		Vehicle vl=vr.save(v);
		
		ResponceStructure<Vehicle> rv=new ResponceStructure<Vehicle>();
		rv.setStatusCode(HttpStatus.CREATED.value());
		rv.setMessage("STUDENT WITH MOBNO :"+mob+"HAS BEEN UPDATE");
		rv.setData(vl);
		return rv;
		
	}

	




		
}
	


	

	
	
	
	
	

