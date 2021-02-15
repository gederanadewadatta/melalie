/**
 * 
 */
package com.melalietest.rana.assessment.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.melalietest.rana.assessment.staging.CustomerData;

/**
 * @author anitamarsafira
 *
 */
@Service
@Transactional
public interface CustomerService {

	Optional<CustomerData> findUserBySpesificDate(String dateFrom, String dateTo,String maxCustomer);

}
