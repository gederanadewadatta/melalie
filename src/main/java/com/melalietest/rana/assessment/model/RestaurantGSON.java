/**
 * 
 */
package com.melalietest.rana.assessment.model;

import java.util.List;

/**
 * @author anitamarsafira
 *
 */
public class RestaurantGSON {
	private String name;
	private String location;
	private String balance;
	private String business_hours;
	private List<String> menu;
	
	
	public RestaurantGSON(String name, String location, String balance, String business_hours,
			List<String> menu) {
		super();
		this.name = name;
		this.location = location;
		this.balance = balance;
		this.business_hours = business_hours;
		this.menu = menu;
	}
	public RestaurantGSON() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the business_hours
	 */
	public String getBusiness_hours() {
		return business_hours;
	}
	/**
	 * @param business_hours the business_hours to set
	 */
	public void setBusiness_hours(String business_hours) {
		this.business_hours = business_hours;
	}
	/**
	 * @return the menu
	 */
	public List<String> getMenu() {
		return menu;
	}
	/**
	 * @param menu the menu to set
	 */
	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	
}
