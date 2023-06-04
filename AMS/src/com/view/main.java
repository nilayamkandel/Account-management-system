package com.view;

import java.util.Scanner;

import com.model.Account;
import com.service.AccountService;
import com.service.AccountServiceImpl;


public class main {
	
	public static void main(String[] args) {
		addName();
		
		
	}
	
	static void addName() {
		Scanner sc = new Scanner(System.in);
		AccountService as = new AccountServiceImpl();
		char flag = 'y';
		do {
			
			System.out.println("enter username");
			System.out.println("enter accountNo");
			Account ac = new Account(sc.next(),sc.nextInt());
			as.AddUser(ac);
			System.out.println("do you want  to add more? [y/n]");
			flag = sc.next().charAt(0);
		}while(flag == 'y');
	}
	
	static void addMoney() {
		
	}
	
	static void updateMoney() {
		
	}
	
	
	
	static void getAll() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
