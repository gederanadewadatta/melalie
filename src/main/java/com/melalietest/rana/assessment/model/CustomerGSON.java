/**
 * 
 */
package com.melalietest.rana.assessment.model;

import java.util.List;

/**
 * @author anitamarsafira
 *
 */
public class CustomerGSON {
	private String name;
	private String location;
	private String balance;
	private List<String> purchases;
	
	
	
	
	
	public CustomerGSON() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerGSON(String name, String location, String balance, List<String> purchases) {
		super();
		this.name = name;
		this.location = location;
		this.balance = balance;
		this.purchases = purchases;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the balance
	 */
	public String getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}
	/**
	 * @return the purchases
	 */
	public List<String> getPurchases() {
		return purchases;
	}
	/**
	 * @param purchases the purchases to set
	 */
	public void setPurchases(List<String> purchases) {
		this.purchases = purchases;
	}
	@Override
	public String toString() {
		return "UserGSON [name=" + name + ", location=" + location + ", balance=" + balance + ", purchases=" + purchases
				+ "]";
	}
}
