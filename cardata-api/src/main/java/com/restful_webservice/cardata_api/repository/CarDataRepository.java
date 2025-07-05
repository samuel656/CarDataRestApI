package com.restful_webservice.cardata_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful_webservice.cardata_api.model.CarData;
@Repository
public interface CarDataRepository extends JpaRepository<CarData, Integer> {

}
