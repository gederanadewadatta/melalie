/**
 * 
 */
package com.melalietest.rana.assessment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melalietest.rana.assessment.model.Restaurant;

/**
 * @author anitamarsafira
 *
 */
@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
	@Query("SELECT n FROM restaurant n WHERE n.restaurantName = ?1")
	List<Restaurant> findByRestaurantName(String restaurantName);

	@Query("SELECT n FROM restaurant n WHERE n.restaurantBusinessHoursOpen = ?1 and n.restaurantBusinessHoursClose=?2")
	Optional<Restaurant> findRestaurantByOpenFromAndOpenTo(String openFrom, String openTo);

	@Query("SELECT n FROM restaurant n WHERE n.restaurantLocation = ?1")
	Optional<Restaurant> findRestaurantByCustLocation(String location);

	@Query("SELECT n FROM restaurant n WHERE n.restaurantBusinessHoursClose-n.restaurantBusinessHoursOpen = ?1")
	Optional<Restaurant> findRestaurantByOperasionalHours(String datetime);

	@Query("Select n from restaurant n join restaurantmenu o on n.id = o.restaurantid where o.restaurantmenuname=?1")

	Optional<Restaurant> findRestaurantByExactlyDishName(String name);

}
