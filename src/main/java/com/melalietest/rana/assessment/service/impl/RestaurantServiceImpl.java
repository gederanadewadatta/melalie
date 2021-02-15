/**
 * 
 */
package com.melalietest.rana.assessment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.melalietest.rana.assessment.repository.*;
import com.melalietest.rana.assessment.model.*;
import com.melalietest.rana.assessment.service.RestaurantService;
import com.melalietest.rana.assessment.staging.RestaurantData;
import com.melalietest.rana.assessment.staging.RestaurantPopularData;

/**
 * @author anitamarsafira
 *
 */

public class RestaurantServiceImpl implements RestaurantService {
	@Autowired
	RestaurantRepository restaurantRepo;
//	@Autowired
	RestaurantMenuRepository restaurantMenuRepo;
	@Autowired
	PurchaseRepository purchaseRepo;

	@Override
	public Iterable<Restaurant> findAll() {
		// TODO Auto-generated method stub
		Iterable<Restaurant> restaurantList = restaurantRepo.findAll();
		return restaurantList;
	}

	@Override
	public List<Restaurant> findByRestaurantName(String restaurantName) {
		// TODO Auto-generated method stub
		return restaurantRepo.findByRestaurantName(restaurantName);
	}

	@Override
	public Purchase createPurchasing(Purchase purchase) {
		// TODO Auto-generated method stub
		return purchaseRepo.save(new Purchase(purchase.getId(), purchase.getRestaurantId(), purchase.getCustomerId(),
				purchase.getDishName(), purchase.getAmount(), purchase.getPurchaseDate()));
	}

	@Override
	public Optional<Restaurant> findById(long id) {
		// TODO Auto-generated method stub
		return restaurantRepo.findById(id);
	}

	@Override
	public Optional<Restaurant> findRestaurantByOpenFromAndOpenTo(long openFrom, long openTo) {
		// TODO Auto-generated method stub
		return restaurantRepo.findRestaurantByOpenFromAndOpenTo(String.valueOf(openFrom), String.valueOf(openTo));
	}

	@Override
	public Optional<Restaurant> findRestaurantByCustLocation(String location) {
		// TODO Auto-generated method stub
		return restaurantRepo.findRestaurantByCustLocation(location);
	}

	@Override
	public Optional<Restaurant> findRestaurantByOperasionalHours(String datetime) {
		// TODO Auto-generated method stub
		return restaurantRepo.findRestaurantByOperasionalHours(datetime);
	}

	@Override
	public List<RestaurantMenu> findRestaurantByPriceRange(int priceFrom, int priceTo) {
		// TODO Auto-generated method stub
		
		return restaurantMenuRepo.findRestaurantByPriceRange(priceFrom,priceTo);
	}

	@Override
	public Optional<RestaurantData> findRestaurantOrDishByName(String name) {
		// TODO Auto-generated method stub
		return restaurantMenuRepo.findRestaurantOrDishByName(name);
	}

	@Override
	public Optional<Restaurant> findRestaurantByExactlyDishName(String name) {
		// TODO Auto-generated method stub
		return restaurantRepo.findRestaurantByExactlyDishName(name);
	}

	@Override
	public Iterable<RestaurantPopularData> findByPopularRestaurant() {
		// TODO Auto-generated method stub
		return restaurantRepo.findByPopularRestaurant();
	}

}
