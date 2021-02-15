/**
 * 
 */
package com.melalietest.rana.assessment.service.impl;
 
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.melalietest.rana.assessment.repository.CustomerRepository;
import com.melalietest.rana.assessment.repository.PurchaseRepository;
import com.melalietest.rana.assessment.service.CustomerService;
import com.melalietest.rana.assessment.staging.CustomerData;

/**
 * @author anitamarsafira
 *
 */
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	PurchaseRepository purchaseRepo;
	@Autowired
	CustomerRepository customerRepo;
	
	@Override
	public Optional<CustomerData> findUserBySpesificDate(String dateFrom, String dateTo,String maxCustomer) {
		// TODO Auto-generated method stub
		Date dFrom = new Date();
		dFrom.parse(dateFrom);
		
		Date dTo = new Date();
		dTo.parse(dateTo);
		
		return customerRepo.findUserBySpesificDate(dFrom,dTo,maxCustomer);
	}

}
