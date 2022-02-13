package com.sai.springexpensetracker.services;

import com.sai.springexpensetracker.models.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance balance);
	public Balance createBalance();
}
