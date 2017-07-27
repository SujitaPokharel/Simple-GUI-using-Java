/*
 **********************************************************************
 *                      Author: Sujita                                *
 *                                                                    *
 **********************************************************************
 */

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account() {
		setDateCreated(new Date());
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		setDateCreated(new Date());
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return balance;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * annualInterestRate / 12;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
// setting getter method for deep clone
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
