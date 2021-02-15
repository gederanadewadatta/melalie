package com.melalietest.rana.assessment.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "restaurantId")
	private int restaurantId;
	@Column(name = "customerId")
	private int customerId;
	@Column(name = "dishName")
	private String dishName;
	@Column(name = "amount")
	private String amount;
	@Column(name = "purchaseDate")
	private Date purchaseDate;

	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Purchase(long id, int restaurantId, int customerId, String dishName, String amount, Date purchaseDate) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.customerId = customerId;
		this.dishName = dishName;
		this.amount = amount;
		this.purchaseDate = purchaseDate;
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
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}

	/**
	 * @param dishName the dishName to set
	 */
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * @param purchaseDate the purchaseDate to set
	 */
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", restaurantId=" + restaurantId + ", customerId=" + customerId + ", dishName="
				+ dishName + ", amount=" + amount + ", purchaseDate=" + purchaseDate + "]";
	}

}
