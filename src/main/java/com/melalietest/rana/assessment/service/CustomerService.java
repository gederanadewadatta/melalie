/**
 * 
 */
package com.melalietest.rana.assessment.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.melalietest.rana.assessment.staging.CustomerData;

/**
 * @author anitamarsafira
 *
 */
@Service 
public interface CustomerService {

	List<CustomerData> findUserBySpesificDate(String dateFrom, String dateTo,String maxCustomer);

}
