package com.melalietest.rana.assessment.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 
import com.melalietest.rana.assessment.model.RestaurantMenu;

@Repository
public interface RestaurantMenuRepository extends CrudRepository<RestaurantMenu, Long>{

}
