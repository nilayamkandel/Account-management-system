package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.model.Account;

public class AccountServiceImpl implements AccountService {

	@Override
	public void AddUser(Account a) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "");
			
			String sql = "insert into useraccount(userName,accountNo)values('"+a.getUserName()+"','"+a.getAccountNo()+"')";
			Statement stm = con.createStatement();
			stm.execute(sql);
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}

	@Override
	public void AddAmount(Account a) {
		
		
	}

	@Override
	public void UpdateAmount(Account a) {
	
		
	}

	@Override
	public void DeleteAmount(int index) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "");

			String sql = "delete from useraccount where id = 1";
			Statement stm = con.createStatement();
			stm.execute(sql);		
			System.out.println("delete success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void GetUser(int userid) {
		
		
	}

}
