package com.melalietest.rana.assessment.staging;

public class CustomerData {
	private long customerId;
	private String customerName;
	private String purchaseAmount;
	@Override
	public String toString() {
		return "CustomerData [customerId=" + customerId + ", customerName=" + customerName + ", purchaseAmount="
				+ purchaseAmount + "]";
	}
	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	 * @return the purchaseAmount
	 */
	public String getPurchaseAmount() {
		return purchaseAmount;
	}
	/**
	 * @param purchaseAmount the purchaseAmount to set
	 */
	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public CustomerData(long customerId, String customerName, String purchaseAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.purchaseAmount = purchaseAmount;
	}
	public CustomerData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
