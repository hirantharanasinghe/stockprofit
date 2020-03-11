package com.test.stock.stockProfit.service;

import com.test.stock.stockProfit.trade.TradeProfit;


public class TradeServiceUtil 
{

	/**
	 * Iterate through the given stock prices and return {@link TradeProfit} object
	 * which gives the maximum profit based on the available stock prices.
	 * It returns <code>null</code> if profit cannot be calculated.
	 * 
	 * @param stockPrices array of stock prices.
	 * @return a {@link TradeProfit} if available. Otherwise return null.
	 */
	public static TradeProfit getMaxProfit(int[] stockPrices) 
	{
		
		TradeProfit profit = null;
		
		for(int i = 0; i < stockPrices.length -1; i++) 
		{
			
			int purchase = stockPrices[i];
			int sell = stockPrices[i+1];
			
			// SELL value needs to be larger than BUY value. 
			if(purchase < sell) 
			{
				if(profit == null) 
				{
					profit = new TradeProfit(purchase, sell);
				}
				// If the current BUY value is larger than the given value, 
				// update the Profit object with new BUY value.
				else if(profit.getPurchaseValue() > purchase)
				{
					profit.setPurchaseValue(purchase);
				} 
				// If the current SELL value of the profit object is smaller than comparing SELL value,
				// update the SELL value of the Profit object.
				else if(profit.getSellValue() < sell)
				{
					profit.setSellValue(sell);
				}
				
			}
		}
		
		return profit;
	}

}
