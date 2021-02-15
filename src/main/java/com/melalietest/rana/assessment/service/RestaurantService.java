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


}
