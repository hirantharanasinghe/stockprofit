# stockprofit

This is a simple Java solution to fin the max profit based on the array(integer) of stock prices.

Example:
Suppose we could access yesterday's stock prices as a list, where:
    • The indices are the time in minutes past trade opening time, which was 10:00am local time.
    • The values are the price in dollars of the stock at that time.
    • So if the stock cost $5 at 11:00am, stock_prices_yesterday[60] = 5.
    
TradeServiceUtil.getMaxProfit() method takes an array of stock prices and returns the best profit could have been made from 1 purchase and 1 sale of 1 stock.
For example:
int[] stockPrices = {10, 7, 5, 8, 11, 9};

Assert.assertEquals (6, getMaxProfit(stockPrices)); // returns 6 (buy at $5 sell
								at $11)
