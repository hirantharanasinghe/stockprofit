package com.test.stock.stockProfit.trade;

/**
 * This class hold the information related to a trade.
 * Information of this class can be used to derive the possible profit of the trade.
 * 
 * @author Hirantha
 *
 */
public class TradeProfit {

	private int purchaseValue;
	
	private int sellValue;
	

	public TradeProfit(int purchaseValue, int sellValue) {
		this.purchaseValue = purchaseValue;
		this.sellValue = sellValue;
	}

	public int getPurchaseValue() {
		return purchaseValue;
	}

	public void setPurchaseValue(int purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	public int getSellValue() {
		return sellValue;
	}

	public void setSellValue(int sellValue) {
		this.sellValue = sellValue;
	}
	
	public int getProfit() {
		return sellValue - purchaseValue;
	}
	
	
}
