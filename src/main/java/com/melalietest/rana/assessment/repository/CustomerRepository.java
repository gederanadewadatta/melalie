/**
 * 
 */
package com.melalietest.rana.assessment.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.melalietest.rana.assessment.model.Customer;
import com.melalietest.rana.assessment.staging.CustomerData;

/**
 * @author anitamarsafira
 *
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
//	@Query("Select o.id,o.customerName,n.amount from purchase n join customer o on n.customerId = o.id "
//			+ "where n.purchaseDate between ?1 and ?2 order by n.customerId,n.amount ASC LIMIT ?3")
//	Optional<CustomerData> findUserBySpesificDate(Date dFrom, Date dTo,String maxCustomer);
	@Query("select n from customer n where n.id =?1")
	List<Customer> findByCustId(long customerId);

}
