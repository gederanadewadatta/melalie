/**
 * 
 */
package com.melalietest.rana.assessment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melalietest.rana.assessment.model.Customer;

/**
 * @author anitamarsafira
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
