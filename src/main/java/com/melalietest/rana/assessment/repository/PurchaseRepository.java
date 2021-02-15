package com.melalietest.rana.assessment.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melalietest.rana.assessment.model.Purchase; 

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
	
	List<Purchase> findUserBySpesificDate(Date dFrom, Date dTo);

}
