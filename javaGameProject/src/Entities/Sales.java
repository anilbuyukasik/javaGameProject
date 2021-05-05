package Entities;

import Abstract.Entity;

public class Sales implements Entity{
	private int salesId;
	private int gamerId;
	private int gameId;
	private int compaignId;
	private double totalPrice;
	
	public Sales() {
		
	}
	
	public Sales(int salesId, int gamerId, int gameId, int compaignId, double totalPrice) {
		this.salesId = salesId;
		this.gamerId = gamerId;
		this.gameId = gameId;
		this.compaignId = compaignId;
		this.totalPrice = totalPrice;
	}

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCompaignId() {
		return compaignId;
	}

	public void setCompaignId(int compaignId) {
		this.compaignId = compaignId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
