package com.java.assignment.stocks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class StockOperations {
	
	private List<Trade> tradeList;

	/**
	 * This methods validates the input price and returns the dividend yield
	 * based on the fixed dividend
	 * if fixed dividend is available then dividend yield = (fixedDividend*parValue)/price
	 * If not available lastDividend/price
	 * 
	 * @param price
	 * @return dividendYield
	 */
	public double calculateDividend(Stock stock, double price){
		
		//Validating the price input
		if(price <= 0.0){
			System.out.println("Price cannot be zero or negative");
		}
		
		if(stock.getFixedDividend() != 0.0){
			//if fixed dividend is available then return preferred dividend yield
			return (stock.getFixedDividend()*stock.getParValue())/price;
		}else{
			//if fixed dividend is not available then return common 
			//dividend yield
			return stock.getLastDividend()/price;
		}
		
	}
	
	/**
	 * Method to calculate P/E ration for the stock
	 * It first validates the input price and last dividend for non zero values
	 * If both are not zero returns the P/E ration.
	 * Otherwise returns 0
	 * @param price
	 * @return
	 */
	public double calculatePERatio(Stock stock, double price){
		//Validating the price input
		if(price <= 0.0){
			System.out.println("Price cannot be zero or negative");
		}
		if(stock.getLastDividend() == 0){
			System.out.println("P/E ratio can't be determined for "+stock.getStockSymbol()
					+" as last dividend is zero");
			return 0;
		}else{
			return price/stock.getLastDividend();
		}
	}
	
	/**
	 * This method records the trade of the stock by adding a record to the 
	 * tradeList
	 * @param quantity
	 * @param buyIndic
	 * @param tradedPrice
	 */
	public void recodeTrades(int quantity, boolean buyIndic, double tradedPrice){
		if(quantity <= 0 || tradedPrice <=0 ){
			System.out.println("Trade cannot be recorded, as Quantiy or Traded"
					+ "price is not valid");
			return;
		}
		if(tradeList == null ){
			tradeList = new ArrayList<Trade>();		
		}
		tradeList.add(new Trade(quantity, buyIndic, tradedPrice));
	}
	
	/**
	 * This method calculates Volume Weighted Stock Price for trades done in
	 * past 15 mins
	 * @param tradeList
	 * @return
	 */
	public double calcVolWeighStockPrice(){
		if(tradeList == null || tradeList.isEmpty()){
			System.out.println("Voulme Weighted Stock Price cannot be "
					+ "calculated as Trades are not available");
			return 0.0;
		}
		Date currentTime = new Date();
		double totalPrice = 0.0;
		double totalQuantity = 0.0;
		
		for (Trade trade : tradeList) {
			if(currentTime.compareTo(trade.getTimeOfPurchase())<= 15L*60*1000){
				totalPrice = totalPrice + (trade.getTradedPrice()*trade.getQuantity());
				totalQuantity = totalQuantity + trade.getQuantity();
			}
		}

		if(totalQuantity == 0){
			System.out.println("Volume Weighted Stock price cannot be "
					+ "calculated as total Quantity of shares is zero");
			return 0.0;
		}else{
			return totalPrice/totalQuantity;
		}

	}
}
