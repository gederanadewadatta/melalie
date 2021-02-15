package com.melalietest.rana.assessment.staging;
 

public class RestaurantData {
	private long restaurantId;
	private String restaurantName;
	private String restaurantLocation;
	private String restaurantBalance;
	private String restaurantBusinessDay;
	private int restaurantBusinessHoursOpen;
	private int restaurantBusinessHoursClose;
	private long restaurantMenuId;
	private String restaurantMenuName;
	private String restaurantMenuPrice;
	
	
	
	public RestaurantData() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RestaurantData(long restaurantId, String restaurantName, String restaurantLocation, String restaurantBalance,
			String restaurantBusinessDay, int restaurantBusinessHoursOpen, int restaurantBusinessHoursClose,
			long restaurantMenuId, String restaurantMenuName, String restaurantMenuPrice) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.restaurantBalance = restaurantBalance;
		this.restaurantBusinessDay = restaurantBusinessDay;
		this.restaurantBusinessHoursOpen = restaurantBusinessHoursOpen;
		this.restaurantBusinessHoursClose = restaurantBusinessHoursClose;
		this.restaurantMenuId = restaurantMenuId;
		this.restaurantMenuName = restaurantMenuName;
		this.restaurantMenuPrice = restaurantMenuPrice;
	}



	/**
	 * @return the restaurantId
	 */
	public long getRestaurantId() {
		return restaurantId;
	}



	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
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
	 * @return the restaurantMenuId
	 */
	public long getRestaurantMenuId() {
		return restaurantMenuId;
	}



	/**
	 * @param restaurantMenuId the restaurantMenuId to set
	 */
	public void setRestaurantMenuId(long restaurantMenuId) {
		this.restaurantMenuId = restaurantMenuId;
	}



	/**
	 * @return the restaurantMenuName
	 */
	public String getRestaurantMenuName() {
		return restaurantMenuName;
	}



	/**
	 * @param restaurantMenuName the restaurantMenuName to set
	 */
	public void setRestaurantMenuName(String restaurantMenuName) {
		this.restaurantMenuName = restaurantMenuName;
	}



	/**
	 * @return the restaurantMenuPrice
	 */
	public String getRestaurantMenuPrice() {
		return restaurantMenuPrice;
	}



	/**
	 * @param restaurantMenuPrice the restaurantMenuPrice to set
	 */
	public void setRestaurantMenuPrice(String restaurantMenuPrice) {
		this.restaurantMenuPrice = restaurantMenuPrice;
	}



	@Override
	public String toString() {
		return "RestaurantData [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", restaurantLocation=" + restaurantLocation + ", restaurantBalance=" + restaurantBalance
				+ ", restaurantBusinessDay=" + restaurantBusinessDay + ", restaurantBusinessHoursOpen="
				+ restaurantBusinessHoursOpen + ", restaurantBusinessHoursClose=" + restaurantBusinessHoursClose
				+ ", restaurantMenuId=" + restaurantMenuId + ", restaurantMenuName=" + restaurantMenuName
				+ ", restaurantMenuPrice=" + restaurantMenuPrice + "]";
	}
	
	
	
	
}
