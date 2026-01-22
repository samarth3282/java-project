package com.samarth.bank.dao;

import com.samarth.bank.model.Account;

public class AccountDAOImpl extends AbstractDAO<Account> implements IAccountDAO {

    public AccountDAOImpl() {
        this.setPersistentClass(Account.class);
    }

}
