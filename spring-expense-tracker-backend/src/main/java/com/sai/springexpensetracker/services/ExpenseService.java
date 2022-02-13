package com.sai.springexpensetracker.services;

import java.util.List;

import com.sai.springexpensetracker.models.Expense;
import com.sai.springexpensetracker.models.User;

public interface ExpenseService {
	public Expense saveExpense(Expense expense);
	public List<Expense> filterExpenseBetween(String startDate,String endDate);
	public List<Expense> filterUserExpenseBetween(User user,String startDate,String endDate);
	public void deleteByUserAndID(User user,long id);
}
