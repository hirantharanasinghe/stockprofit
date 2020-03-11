package com.test.stock.stockProfit.service;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.test.stock.stockProfit.trade.TradeProfit;


public class TradeServiceUtilTest 
{
	@Test
	public void testGetMaxProfit_1() 
	{
		int[] stockPrices = {10, 7, 5, 8, 11, 9};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);

		assertEquals(6, profit.getProfit());
	}
	
	@Test
	public void testGetMaxProfit_2() 
	{
		int[] stockPrices = {10, 7, 5, 8, 11, 9, 13};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);
		
		assertEquals(8, profit.getProfit());
	}
	
	@Test
	public void testGetMaxProfit_3() 
	{
		int[] stockPrices = {1,1,1,1,1,1,10, 7, 5, 8, 11, 9, 13};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);
		
		assertEquals(12, profit.getProfit());
	}
	
	@Test
	public void testGetMaxProfit_4() 
	{
		int[] stockPrices = {100,100,100,95,90,1,10, 7, 5, 8, 11, 9, 13};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);
		
		assertEquals(12, profit.getProfit());
	}
	
	@Test
	public void testGetMaxProfit_5() 
	{
		int[] stockPrices = {10, 7, 5, 8, 11, 9, 4, 6, 11};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);
		
		assertEquals(7, profit.getProfit());
	}
	@Test
	public void testGetMaxProfit_not_found() 
	{
		int[] stockPrices = {100,100,100,95,90,89,70, 10};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);
		
		assertNull(profit);
	}
	
	@Test
	public void testGetMaxProfit_with_multiples() 
	{
		int[] stockPrices = {10, 7, 5, 8, 11, 9, 7, 6, 11};
		TradeProfit profit = TradeServiceUtil.getMaxProfit(stockPrices);
		
		assertEquals(6, profit.getProfit());
	}
	
}
