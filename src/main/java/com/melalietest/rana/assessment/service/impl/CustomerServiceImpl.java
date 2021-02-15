/**
 * 
 */
package com.melalietest.rana.assessment.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.melalietest.rana.assessment.model.Customer;
import com.melalietest.rana.assessment.model.Purchase;
import com.melalietest.rana.assessment.repository.CustomerRepository;
import com.melalietest.rana.assessment.repository.PurchaseRepository;
import com.melalietest.rana.assessment.service.CustomerService;
import com.melalietest.rana.assessment.staging.CustomerData;

/**
 * @author anitamarsafira
 *
 */
public class CustomerServiceImpl implements CustomerService {
	PurchaseRepository purchaseRepo;
	CustomerRepository customerRepo;

	@Override
	public List<CustomerData> findUserBySpesificDate(String dateFrom, String dateTo, String maxCustomer) {
		// TODO Auto-generated method stub
		Date dFrom = new Date();
		dFrom.parse(dateFrom);

		Date dTo = new Date();
		dTo.parse(dateTo);
		int maxData = Integer.parseInt(maxCustomer);
		CustomerData custData = new CustomerData();
		Customer cust = new Customer();
		Optional<CustomerData> listCustomerData = null;
		List<Customer> listCustomer = null;
		// new ArrayList<Customer>();
		List<CustomerData> custDataList = new ArrayList<CustomerData>();
		List<Purchase> listPurchase = purchaseRepo.findUserBySpesificDate(dFrom, dTo);
		for (Purchase purchase : listPurchase) {
			listCustomer = customerRepo.findByCustId((long) purchase.getCustomerId());
			if (!listCustomer.isEmpty()) {
				for (int i = 0; i < maxData; i++) {
					for (Customer customer : listCustomer) {
						custData.setCustomerId(customer.getId());
						custData.setCustomerName(customer.getCustomerName());
						custData.setPurchaseAmount(purchase.getAmount());
						custDataList.add(custData);
					}
				}
			}
		}
		return custDataList;

	}

}
