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

import com.melalietest.rana.assessment.model.Restaurant;
import com.melalietest.rana.assessment.model.RestaurantMenu;
import com.melalietest.rana.assessment.model.Purchase;

import com.melalietest.rana.assessment.service.CustomerService;
import com.melalietest.rana.assessment.service.RestaurantService;
import com.melalietest.rana.assessment.staging.CustomerData;
import com.melalietest.rana.assessment.staging.RestaurantData;
import com.melalietest.rana.assessment.staging.RestaurantPopularData;

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
	@GetMapping("/restaurant/{id}")
	public ResponseEntity<Restaurant> findRestaurantById(@PathVariable("id") long id) {
		Optional<Restaurant> restaurantData = restaurantService.findById(id);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Find based on Operasional Hours
	@GetMapping("/restaurant/operasional/{datetime}")
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
	public ResponseEntity<Restaurant> findRestaurantByOpenFromAndOpenTo(@PathVariable("datetimefrom") long openFrom,
			@PathVariable("datetimeto") long openTo) {
		Optional<Restaurant> restaurantData = restaurantService.findRestaurantByOpenFromAndOpenTo(openFrom, openTo);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Find based on Price Range
	@GetMapping("/restaurant/price/{priceFrom}/{priceFrom}")
	public ResponseEntity<Restaurant> findRestaurantByPriceRange(@PathVariable("priceFrom") int priceFrom,
			@PathVariable("priceTo") int priceTo) {

		List<RestaurantMenu> restaurantMenuData = restaurantService.findRestaurantByPriceRange(priceFrom, priceTo);
		Optional<Restaurant> restaurantData = null;
		if (!restaurantMenuData.isEmpty()) {
			for (RestaurantMenu restaurantMenu : restaurantMenuData) {
				restaurantData = restaurantService.findById(restaurantMenu.getId());
			}
		}

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Find Restaurant or Dish by Name
	@GetMapping("/restaurant/menu/{name}")

	public ResponseEntity<RestaurantData> findRestaurantOrDishByName(@PathVariable("name") String name) {
		Optional<RestaurantData> restaurantData = restaurantService.findRestaurantOrDishByName(name);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Find Restaurant by exactly Dish Name
	@GetMapping("/restaurant/menu/dish/{name}")

	public ResponseEntity<Restaurant> findRestaurantByExactlyDishName(@PathVariable("name") String name) {
		Optional<Restaurant> restaurantData = restaurantService.findRestaurantByExactlyDishName(name);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Find top User by amount on spesific date
	@GetMapping("/restaurant/customer/amount/{dateFrom}/{dateTo}/{maxcustomer}")

	public ResponseEntity<CustomerData> findXUserBySpesificDate(@PathVariable("dateFrom") String dateFrom,
			@PathVariable("dateTo") String dateTo, @PathVariable("maxcustomer") String maxCustomer) {
		Optional<CustomerData> restaurantData = customerService.findUserBySpesificDate(dateFrom, dateTo, maxCustomer);

		if (restaurantData.isPresent()) {
			return new ResponseEntity<>(restaurantData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	// Find most popular Restaurant
	@GetMapping("/restaurant/popular/")
	public ResponseEntity<List<RestaurantPopularData>> getPopularRestaurant() {
		try {
			List<RestaurantPopularData> restaurantLists = new ArrayList<RestaurantPopularData>();

			restaurantService.findByPopularRestaurant().forEach(restaurantLists::add);

			if (restaurantLists.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(restaurantLists, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
