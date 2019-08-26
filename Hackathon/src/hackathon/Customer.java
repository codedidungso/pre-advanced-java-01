/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import java.util.ArrayList;

/**
 *
 * @author thiennd
 */
public class Customer implements ICustomer {

    ArrayList<Account> listAcounts; // NullPointerExp
    protected String name;

    public Customer() {
        this.listAcounts = new ArrayList<>(); // 0
    }

    @Override
    public Account getAccountByNumber(long number) {
        for (Account account : listAcounts) { // for(int i = 0; i < listAcc.size(); i++ 
            if (account.accountNumber == number) {
                return account;
            }
        }
        return null;
    }

    @Override
    public AccountCard getAccountCardByNumber(long number) {
        for (Account account : listAcounts) {
            if (account.getClass() == AccountCard.class) {
                if (account.accountNumber == number) {
                    return (AccountCard) account;
                }
            }
        }
        return null;
    }

    @Override
    public AccountSaving getAccountSavingByNumber(long number) {
        for (Account account : listAcounts) {
            if (account.getClass() == AccountSaving.class) {
                if (account.accountNumber == number) {
                    return (AccountSaving) account;
                }
            }
        }
        return null;
    }

    @Override
    public void createAccountSaving(long accountNumber) {
        if (listAcounts.size() < 10) {
            this.listAcounts.add(new AccountSaving(accountNumber));
        } else {
            System.out.println("Gioi han 10 tai khoan!!");
        }
    }

    @Override
    public void createAccountCard(long accountNumber) {
        if (listAcounts.size() < 10) {
            this.listAcounts.add(new AccountCard(accountNumber));
        } else {
            System.out.println("Gioi han 10 tai khoan!!");
        }
    }

    @Override
    public void listAllAcounts() {
        System.out.printf("=====\nTen khach hang: %s\n", name);
        for (Account account : listAcounts) {
            account.showInfo();
        }
    }

    @Override
    public void linked2Aaccounts(long accountCardNumber, long accountSavingNumber) {
        AccountCard tempCard = null;
        AccountSaving tempSaving = null;
        int cardIndex = -1;
        for (int i = 0; i < listAcounts.size(); i++) {
            if (listAcounts.get(i).accountNumber == accountCardNumber) {
                tempCard = (AccountCard) listAcounts.get(i);
                cardIndex = i;
            }
            if (listAcounts.get(i).accountNumber == accountSavingNumber) {
                tempSaving = (AccountSaving) listAcounts.get(i);
            }
        }
        if (tempCard == null || tempSaving == null) {
            System.out.println("Khong tim thay the!!");
            return;
        }
        tempCard.setLinkedAccount(tempSaving);
        listAcounts.set(cardIndex, tempCard);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
