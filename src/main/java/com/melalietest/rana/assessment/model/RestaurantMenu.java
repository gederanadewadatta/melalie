/**
 * 
 */
package com.melalietest.rana.assessment.model;

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
@Table(name = "restaurantmenu")
public class RestaurantMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "restaurantId")
	private String restaurantId;
	@Column(name = "restaurantMenuName")
	private String restaurantMenuName;
	@Column(name = "restaurantMenuPrice")
	private String restaurantMenuPrice;

	public RestaurantMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RestaurantMenu [id=" + id + ", restaurantId=" + restaurantId + ", restaurantMenuName="
				+ restaurantMenuName + ", restaurantMenuPrice=" + restaurantMenuPrice + "]";
	}

	public RestaurantMenu(long id, String restaurantId, String restaurantMenuName, String restaurantMenuPrice) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.restaurantMenuName = restaurantMenuName;
		this.restaurantMenuPrice = restaurantMenuPrice;
	}

	/**
	 * @return the restaurantId
	 */
	public String getRestaurantId() {
		return restaurantId;
	}

	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
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

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

}
