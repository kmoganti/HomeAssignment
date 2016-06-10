/**
 * 
 */
package com.java.assignment.stocks;

import java.util.List;

/**
 * @author Kiran
 *
 */
public class StockGMCalculator {
	/**
	 * This method calculates the geometric meridian of given stocks
	 * @param stockList
	 * @return geometric meridian
	 */
	public static double calculateGeoMetricMean(List<Stock> stockList){
		double totalStockPrice = 0.0;
		
		for (Stock stock : stockList) {
			totalStockPrice += stock.getParValue();
		}
		
		return Math.pow(totalStockPrice, 1f/stockList.size());
		
	}
}
