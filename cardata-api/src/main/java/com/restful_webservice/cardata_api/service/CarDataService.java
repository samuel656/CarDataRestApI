package com.restful_webservice.cardata_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.restful_webservice.cardata_api.model.CarData;
import com.restful_webservice.cardata_api.repository.CarDataRepository;
@Service
public class CarDataService {
	@Autowired
	private CarDataRepository carDataRepository;

	public ResponseEntity<Object> addCarData(CarData carData) {
		if(carData==null)
		{
			return new ResponseEntity<>("No Data Available",HttpStatus.BAD_REQUEST);
		}
		CarData newCarData=carDataRepository.save(carData);
		return new ResponseEntity<>(newCarData,HttpStatus.CREATED);
	}
	
	public ResponseEntity<Object> getCarData() {
		List<CarData> listOfCars=carDataRepository.findAll();
		if(listOfCars.isEmpty())
		{
			return new ResponseEntity<>("No Cars Available",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listOfCars,HttpStatus.OK);
	}

	public ResponseEntity<Object> updateCarDataPrice(CarData carData) {
		Optional<CarData> existingCarData=carDataRepository.findById(carData.getCarId());
		if(existingCarData.isPresent())
		{
			CarData UpdatedcarData=existingCarData.get();
			UpdatedcarData.setPrice(carData.getPrice());
			carDataRepository.save(UpdatedcarData);
			return new ResponseEntity<>("Car Price Updated Successfully",HttpStatus.OK);
			
		}
		return new ResponseEntity<>("Car Not Found to Update",HttpStatus.NOT_FOUND);
	}

	public ResponseEntity<Object> deleteCarData(int carId) {
		Optional<CarData> existingCarData=carDataRepository.findById(carId);
		if(existingCarData.isPresent())
		{
			CarData deletecarData=existingCarData.get();
			carDataRepository.deleteById(deletecarData.getCarId());
			return new ResponseEntity<>("Car Data Deleted Successfully",HttpStatus.OK);
			
		}
		return new ResponseEntity<>("Car Not Found to Delete",HttpStatus.NOT_FOUND);
	}	

}
