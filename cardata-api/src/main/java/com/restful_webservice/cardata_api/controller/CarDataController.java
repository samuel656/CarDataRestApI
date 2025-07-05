package com.restful_webservice.cardata_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful_webservice.cardata_api.model.CarData;
import com.restful_webservice.cardata_api.service.CarDataService;

@RestController
public class CarDataController {
	
	@Autowired
	private CarDataService carDataService;
	
	@PostMapping("carData/add-cardata")
	public ResponseEntity<Object> addCarData(@RequestBody CarData carData)
	{
		return carDataService.addCarData(carData);
	}
	
	@GetMapping("carData/get-cardata")
	public ResponseEntity<Object> getCarData()
	{
		return carDataService.getCarData();
	}
	
	@PutMapping("carData/update-cardata")
	public ResponseEntity<Object> updateCarDataPrice(@RequestBody CarData carData)
	{
		return carDataService.updateCarDataPrice(carData);
	}
	
	@DeleteMapping("carData/delete-cardata/{carId}")
	public ResponseEntity<Object> deleteCarDataPrice(@PathVariable int carId)
	{
		return carDataService.deleteCarData(carId);
	}

}
