package com.binance.client.model.trade.v2;

import java.math.BigDecimal;

public class AccountBalance{
	private String accountAlias;
	private BigDecimal maxWithdrawAmount;
	private BigDecimal balance;
	private BigDecimal crossWalletBalance;
	private BigDecimal crossUnPnl;
	private Long updateTime;
	private String asset;
	private boolean marginAvailable;
	private BigDecimal availableBalance;

	public String getAccountAlias() {
		return accountAlias;
	}

	public void setAccountAlias(String accountAlias) {
		this.accountAlias = accountAlias;
	}

	public BigDecimal getMaxWithdrawAmount() {
		return maxWithdrawAmount;
	}

	public void setMaxWithdrawAmount(BigDecimal maxWithdrawAmount) {
		this.maxWithdrawAmount = maxWithdrawAmount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getCrossWalletBalance() {
		return crossWalletBalance;
	}

	public void setCrossWalletBalance(BigDecimal crossWalletBalance) {
		this.crossWalletBalance = crossWalletBalance;
	}

	public BigDecimal getCrossUnPnl() {
		return crossUnPnl;
	}

	public void setCrossUnPnl(BigDecimal crossUnPnl) {
		this.crossUnPnl = crossUnPnl;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public boolean isMarginAvailable() {
		return marginAvailable;
	}

	public void setMarginAvailable(boolean marginAvailable) {
		this.marginAvailable = marginAvailable;
	}

	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(BigDecimal availableBalance) {
		this.availableBalance = availableBalance;
	}

	@Override
	public String toString() {
		return "AccountBalance{" +
				"accountAlias='" + accountAlias + '\'' +
				", maxWithdrawAmount=" + maxWithdrawAmount +
				", balance=" + balance +
				", crossWalletBalance=" + crossWalletBalance +
				", crossUnPnl=" + crossUnPnl +
				", updateTime=" + updateTime +
				", asset='" + asset + '\'' +
				", marginAvailable=" + marginAvailable +
				", availableBalance=" + availableBalance +
				'}';
	}
}
