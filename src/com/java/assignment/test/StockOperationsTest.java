package com.java.assignment.test;

import junit.framework.TestCase;

import com.java.assignment.stocks.Stock;
import com.java.assignment.stocks.StockOperations;

public class StockOperationsTest extends TestCase
{
	StockOperations stockOperations = new StockOperations();

	public void testCalculateDividend()
	{
		Stock stock = new Stock("ALE", "Common", 23, 0, 60);
		double dividendYield = stockOperations.calculateDividend(stock, 60);
		System.out.println("dividendYield: " + dividendYield);
	}

	public void testcalculatePERatio()
	{
		Stock stock = new Stock("ALE", "Common", 23, 0, 60);
		double peRatio = stockOperations.calculatePERatio(stock, 60);
		System.out.println("peRatio: " + peRatio);
	}

	public void testRecordTrades()
	{
		System.out.println("Recording Trades");
		stockOperations.recodeTrades(20, true, 200);
		stockOperations.recodeTrades(30, false, 203);
		stockOperations.recodeTrades(50, false, 206);
		stockOperations.recodeTrades(90, true, 209);
	}

	public void testCalcVolWeighStockPrice()
	{
		stockOperations.recodeTrades(20, true, 200);
		stockOperations.recodeTrades(30, false, 203);
		stockOperations.recodeTrades(50, false, 206);
		stockOperations.recodeTrades(90, true, 209);
		double vwStockPrice = stockOperations.calcVolWeighStockPrice();
		System.out.println("Volume Weighted Stock Price: " + vwStockPrice);
	}
}
