/**
 * 
 */
package com.melalietest.rana.assessment.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author anitamarsafira
 *
 */
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerLocation")
	private String customerLocation;
	@Column(name = "customerBalance")
	private String customerBalance;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerLocation=" + customerLocation
				+ ", customerBalance=" + customerBalance + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long id, String customerName, String customerLocation, String customerBalance) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.customerBalance = customerBalance;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerLocation
	 */
	public String getCustomerLocation() {
		return customerLocation;
	}
	/**
	 * @param customerLocation the customerLocation to set
	 */
	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	/**
	 * @return the customerBalance
	 */
	public String getCustomerBalance() {
		return customerBalance;
	}
	/**
	 * @param customerBalance the customerBalance to set
	 */
	public void setCustomerBalance(String customerBalance) {
		this.customerBalance = customerBalance;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	} 
	
	
	
	
	
}
