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
@Table(name = "restaurant")

public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "restaurantName")
	private String restaurantName;
	@Column(name = "restaurantLocation")
	private String restaurantLocation;
	@Column(name = "restaurantBalance")
	private String restaurantBalance;
	@Column(name = "restaurantBusinessDay")
	private String restaurantBusinessDay;
	@Column(name = "restaurantBusinessHoursOpen")
	private int restaurantBusinessHoursOpen;
	@Column(name = "restaurantBusinessHoursClose")
	private int restaurantBusinessHoursClose;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(long id, String restaurantName, String restaurantLocation, String restaurantBalance,
			String restaurantBusinessDay, int restaurantBusinessHoursOpen, int restaurantBusinessHoursClose) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.restaurantBalance = restaurantBalance;
		this.restaurantBusinessDay = restaurantBusinessDay;
		this.restaurantBusinessHoursOpen = restaurantBusinessHoursOpen;
		this.restaurantBusinessHoursClose = restaurantBusinessHoursClose;
	}

	/**
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}

	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	/**
	 * @return the restaurantLocation
	 */
	public String getRestaurantLocation() {
		return restaurantLocation;
	}

	/**
	 * @param restaurantLocation the restaurantLocation to set
	 */
	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}

	/**
	 * @return the restaurantBalance
	 */
	public String getRestaurantBalance() {
		return restaurantBalance;
	}

	/**
	 * @param restaurantBalance the restaurantBalance to set
	 */
	public void setRestaurantBalance(String restaurantBalance) {
		this.restaurantBalance = restaurantBalance;
	}

	/**
	 * @return the restaurantBusinessDay
	 */
	public String getRestaurantBusinessDay() {
		return restaurantBusinessDay;
	}

	/**
	 * @param restaurantBusinessDay the restaurantBusinessDay to set
	 */
	public void setRestaurantBusinessDay(String restaurantBusinessDay) {
		this.restaurantBusinessDay = restaurantBusinessDay;
	}

	/**
	 * @return the restaurantBusinessHoursOpen
	 */
	public int getRestaurantBusinessHoursOpen() {
		return restaurantBusinessHoursOpen;
	}

	/**
	 * @param restaurantBusinessHoursOpen the restaurantBusinessHoursOpen to set
	 */
	public void setRestaurantBusinessHoursOpen(int restaurantBusinessHoursOpen) {
		this.restaurantBusinessHoursOpen = restaurantBusinessHoursOpen;
	}

	/**
	 * @return the restaurantBusinessHoursClose
	 */
	public int getRestaurantBusinessHoursClose() {
		return restaurantBusinessHoursClose;
	}

	/**
	 * @param restaurantBusinessHoursClose the restaurantBusinessHoursClose to set
	 */
	public void setRestaurantBusinessHoursClose(int restaurantBusinessHoursClose) {
		this.restaurantBusinessHoursClose = restaurantBusinessHoursClose;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", restaurantLocation="
				+ restaurantLocation + ", restaurantBalance=" + restaurantBalance + ", restaurantBusinessDay="
				+ restaurantBusinessDay + ", restaurantBusinessHoursOpen=" + restaurantBusinessHoursOpen
				+ ", restaurantBusinessHoursClose=" + restaurantBusinessHoursClose + "]";
	}

}
