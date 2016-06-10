/**
 * 
 */
package com.java.assignment.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.java.assignment.stocks.Stock;
import com.java.assignment.stocks.StockGMCalculator;

/**
 * @author Kiran
 *
 */
public class StockGMCalculatorTest extends TestCase {

	public void testCalculateGeoMetricMean()
	{
		List<Stock> stockList = new ArrayList<Stock>();
		stockList.add(new Stock("TEA", "Common", 0.0, 0.0, 100));
		stockList.add(new Stock("POP", "Common", 8, 0.0, 100));
		stockList.add(new Stock("ALE", "Common", 23, 0.0, 60));
		stockList.add(new Stock("GIN", "Preferred", 8, 2, 100));
		stockList.add(new Stock("JOE", "Common", 13, 0.0, 250));

		double geometricMean = StockGMCalculator.calculateGeoMetricMean(stockList);
		System.out.println("Geometric Mean: " + geometricMean);
	}
}
