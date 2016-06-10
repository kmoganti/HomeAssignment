package com.java.assignment.stocks;

import java.util.Date;

/**
 * @author Kiran
 *
 */
public class Trade {
	private Date timeOfPurchase;
	private int quantity;
	//True for buy and False for Sell
	private boolean buyIndicator;
	private double tradedPrice;
	
	 
	/**
	 * Constructor for creating Trade object
	 * @param quantity
	 * @param buyIndicator
	 * @param tradedPrice
	 */
	public Trade(int quantity, boolean buyIndicator, double tradedPrice) {
		super();
		//Date() returns current time stamp 
		timeOfPurchase = new Date();
		this.quantity = quantity;
		this.buyIndicator = buyIndicator;
		this.tradedPrice = tradedPrice;
	}
	/**
	 * @return the timeOfPurchase
	 */
	public Date getTimeOfPurchase() {
		return timeOfPurchase;
	}
	/**
	 * @param timeOfPurchase the timeOfPurchase to set
	 */
	public void setTimeOfPurchase(Date timeOfPurchase) {
		this.timeOfPurchase = timeOfPurchase;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the buyIndicator
	 */
	public boolean isBuyIndicator() {
		return buyIndicator;
	}
	/**
	 * @param buyIndicator the buyIndicator to set
	 */
	public void setBuyIndicator(boolean buyIndicator) {
		this.buyIndicator = buyIndicator;
	}
	/**
	 * @return the tradedPrice
	 */
	public double getTradedPrice() {
		return tradedPrice;
	}
	/**
	 * @param tradedPrice the tradedPrice to set
	 */
	public void setTradedPrice(double tradedPrice) {
		this.tradedPrice = tradedPrice;
	}
	
	
	
	
}
