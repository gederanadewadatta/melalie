/**
 * 
 */
package com.melalietest.rana.assessment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.melalietest.rana.assessment.model.Purchase;
import com.melalietest.rana.assessment.model.Restaurant;
import com.melalietest.rana.assessment.model.RestaurantMenu;
import com.melalietest.rana.assessment.staging.RestaurantData;

/**
 * @author anitamarsafira
 *
 */
@Service
@Transactional
public interface RestaurantService {

	Iterable<Restaurant> findAll();

	List<Restaurant> findByRestaurantName(String restaurantName);

	Purchase createPurchasing(Purchase purchase);

	Optional<Restaurant> findById(long id);

	Optional<Restaurant> findRestaurantByOpenFromAndOpenTo(long openFrom, long openTo);

	Optional<Restaurant> findRestaurantByCustLocation(String location);

	Optional<Restaurant> findRestaurantByOperasionalHours(String datetime);

	List<RestaurantMenu> findRestaurantByPriceRange(int priceFrom, int priceTo);

	Optional<RestaurantData> findRestaurantOrDishByName(String name);

	Optional<Restaurant> findRestaurantByExactlyDishName(String name);


}
