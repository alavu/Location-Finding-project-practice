package com.psa.location_web_app_practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.location_web_app_practice.entities.Location;


public interface LocationRepository extends JpaRepository<Location, Long> {

}
