package com.melalietest.rana.assessment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.melalietest.rana.assessment.model.*;
import com.melalietest.rana.assessment.service.CustomerService;
import com.melalietest.rana.assessment.service.RestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService;
	@Autowired
	CustomerService customerService;

	// Find all restaurant List
	@GetMapping("/restaurants")
	public ResponseEntity<List<Restaurant>> getAllRestaurant(@RequestParam(required = false) String restaurantName) {
		try {
			List<Restaurant> restaurantLists = new ArrayList<Restaurant>();

			if (restaurantName == null)
				restaurantService.findAll().forEach(restaurantLists::add);
			else
				restaurantService.findByRestaurantName(restaurantName).forEach(restaurantLists::add);

			if (restaurantLists.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(restaurantLists, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Do purchase
	@PostMapping("/purchase")
	public ResponseEntity<Purchase> createPurchasing(@RequestBody Purchase purchase) {
		try {
			Purchase _tutorial = restaurantService.createPurchasing(purchase);
			return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Find restaurant by ID
	@GetMapping("/restaurants/{id}")
	public ResponseEntity<Restaurant> findRestaurantById(@PathVariable("id") long id) {
		Optional<Restaurant> restaurantData = restaurantService.findById(id);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	//Find based on Operasional Hours
	@GetMapping("/restaurants/operasional/{datetime}")
	public ResponseEntity<Restaurant> findRestaurantByOperasionalHours(@PathVariable("datetime") String datetime) {
		Optional<Restaurant> restaurantData = restaurantService.findRestaurantByOperasionalHours(datetime);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
		
	// Find based on User Location
    @GetMapping("/restaurant/customer/location/{location}")
    public ResponseEntity<Restaurant> findRestaurantByCustLocation(@PathVariable("location") String location) {
    	Optional<Restaurant> restaurantData = restaurantService.findRestaurantByCustLocation(location);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
    }
	// Find based on Date Time
	@GetMapping("/restaurant/open/{datetimefrom}/{datetimeto}")
	public ResponseEntity<Restaurant> findRestaurantByOpenFromAndOpenTo(@PathVariable("datetimefrom") long openFrom,@PathVariable("datetimeto") long openTo) {
		Optional<Restaurant> restaurantData = restaurantService.findRestaurantByOpenFromAndOpenTo(openFrom,openTo);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
