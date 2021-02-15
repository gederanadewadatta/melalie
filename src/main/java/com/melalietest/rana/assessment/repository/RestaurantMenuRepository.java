package com.melalietest.rana.assessment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melalietest.rana.assessment.model.Restaurant;
import com.melalietest.rana.assessment.model.RestaurantMenu;
import com.melalietest.rana.assessment.staging.RestaurantData;

@Repository
public interface RestaurantMenuRepository extends CrudRepository<RestaurantMenu, Long> {

	@Query("Select n from restaurantmenu n where n.restaurantMenuPrice between ?1 and ?2")
	List<RestaurantMenu> findRestaurantByPriceRange(int priceFrom, int priceTo);

	@Query("Select o.id,o.restaurantName,o.restaurantLocation,o.restaurantBalance,o.restaurantBusinessDay,"
			+ "o.restaurantBusinessHoursOpen,o.restaurantBusinessHoursClose,"
			+ "n.id as restaurantMenuId,n.restaurantMenuName,n.restaurantMenuPrice "
			+ "from restaurantmenu n join restaurant o "
			+ "on n.restaurantId = o.id"
			+ "where lower(n.restaurantMenuName) LIKE lower(CONCAT('%', ?1, '%')) OR"
			+ "lower(o.restaurantName) LIKE lower(CONCAT('%', ?1, '%')) order by n.restaurantMenuName ")
	Optional<RestaurantData> findRestaurantOrDishByName(String name);

}
