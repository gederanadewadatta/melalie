package com.melalietest.rana.assessment.staging;

public class RestaurantPopularData {
	private int restaurantId;
	private String restaurantName;
	private int sumAmount;
	private int sumPurchase;
	@Override
	public String toString() {
		return "RestaurantPopularData [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName
				+ ", sumAmount=" + sumAmount + ", sumPurchase=" + sumPurchase + "]";
	}
	/**
	 * @return the restaurantId
	 */
	public int getRestaurantId() {
		return restaurantId;
	}
	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(int restaurantId) {
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
	 * @return the sumAmount
	 */
	public int getSumAmount() {
		return sumAmount;
	}
	/**
	 * @param sumAmount the sumAmount to set
	 */
	public void setSumAmount(int sumAmount) {
		this.sumAmount = sumAmount;
	}
	/**
	 * @return the sumPurchase
	 */
	public int getSumPurchase() {
		return sumPurchase;
	}
	/**
	 * @param sumPurchase the sumPurchase to set
	 */
	public void setSumPurchase(int sumPurchase) {
		this.sumPurchase = sumPurchase;
	}
	public RestaurantPopularData(int restaurantId, String restaurantName, int sumAmount, int sumPurchase) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.sumAmount = sumAmount;
		this.sumPurchase = sumPurchase;
	}
	public RestaurantPopularData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
