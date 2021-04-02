/*Write a program and perform the following steps: Create a class AccountManagement containing following methods: 
 * insertData() to insert account details of customers, displayData() to display account details  depositAmount() to deposit amount of customer 
withdrawAmount() to withdraw amount 
accountBalance() to checkbalance in 
customer’s account. 
The methods should execute as per their specification*/
package com.hefshine.cw;

import java.util.Scanner;

public class Q5_AccountManagement 
{
	int acc_no;
	static int Acc_balance;
	String name;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int ch;
		Q5_AccountManagement am=new Q5_AccountManagement();
		while(true) {
			System.out.println("1.accountBalance\n2.deposit Amount\n3.display data\n4.insertdata");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				am.accountBalance();
				break;
			case 2:
				am.depositAmount();
				break;
			case 3:
				am.displayData();
				break;
			case 4:
				am.insertData();
				break;
			case 5:
				System.exit(4);

			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
	}

	private void accountBalance() 
	{
		System.out.println("Account Balance: "+Acc_balance);
		
	}

	private void depositAmount() {
	
		System.out.println("Enter amount to deposite:");
		Acc_balance-=sc.nextInt();
	}

	private void displayData() {
		System.out.println("Account Balance: "+Acc_balance);
	}

	private void insertData() {
	System.out.println("Enter account balance:");
	Acc_balance+=sc.nextInt();
	System.out.println("Account Balance: "+Acc_balance);
	}

}
