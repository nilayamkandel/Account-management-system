package com.service;

import com.model.Account;

public interface AccountService {
	void AddUser(Account a);
	void AddAmount(Account a);
	void UpdateAmount(Account a);
	void DeleteAmount(int index);
	void GetUser(int userid);
}
