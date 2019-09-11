/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabaihuy;

import java.util.ArrayList;

/**
 *
 * @author thiennd
 */
public class Customer {

    String name;
    ArrayList<Account> listAccounts;

    public Customer(String name) {
        this.name = name;
        this.listAccounts = new ArrayList<>();
    }

    public boolean createAccountCard(String stk) {
        if (listAccounts.size() > 10) {
            return false;
        }
        listAccounts.add(new AccountCard(stk));
        return true;
    }

    public boolean createAccountSaving(String stk) {
        if (listAccounts.size() > 10) {
            return false;
        }
        listAccounts.add(new AccountSaving(stk));
        return true;
    }

    public AccountCard getAccountCardBySTK(String stk) {
        for (int i = 0; i < listAccounts.size(); i++) {
            if (listAccounts.get(i).getClass() == AccountCard.class) {
                if (listAccounts.get(i).getSTK().equals(stk)) {
                    return (AccountCard) listAccounts.get(i);
                }
            }
        }
        return null;
    }

    public AccountSaving getAccountSavingBySTK(String stk) {
        for (int i = 0; i < listAccounts.size(); i++) {
            if (listAccounts.get(i).getClass() == AccountSaving.class) {
                if (listAccounts.get(i).getSTK().equals(stk)) {
                    return (AccountSaving) listAccounts.get(i);
                }
            }
        }
        return null;
    }

    public Account getAccountBySTK(String stk) {
        for (Account account : listAccounts) {
            if (account.getSTK().equals(stk)) {
                return account;
            }
        }
        return null;
    }

    public void showInfo() {
        System.out.println("Nguoi dung: " + name);
        for (int i = 0; i < listAccounts.size(); i++) {
            listAccounts.get(i).kiemTraTaiKhoan();
        }
        System.out.println("===========");
    }
}
