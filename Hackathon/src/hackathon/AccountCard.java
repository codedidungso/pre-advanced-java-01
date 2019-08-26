/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

/**
 *
 * @author thiennd
 */
public class AccountCard extends Account implements IAccountCard {

    AccountSaving linkedAccount = null;

    private AccountCard() {

    }

    public AccountCard(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void setLinkedAccount(AccountSaving as) {
        this.linkedAccount = as;
    }

    @Override
    public AccountSaving getLinkedAccount() {
        return this.linkedAccount;
    }

    @Override
    public long getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public long getMoney() {
        return this.money;
    }

    @Override
    public void setAccountNumber(long accountNumber) {
        if (accountNumber >= 1e13 && accountNumber < 1e14) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("So tai khoan phai co 13 chu so");
        }

    }

    @Override
    public boolean withdraw(long money) {
        if (money <= this.money) { // tk the 
            this.money -= money;
            System.out.printf("Rut thanh cong %d tu tai khoan %d.\n", money, accountNumber);
            return true;
        } else if (linkedAccount == null) {
            System.out.printf("Khong du %d trong tai khoan \n", money, accountNumber);
            return false;
        } else if (linkedAccount.getMoney() + this.money >= money) {
            linkedAccount.withdraw(money - this.money);
            System.out.printf("Rut thanh cong %d tu tai khoan %d va %d tu tai khoan %d. \n", this.money, accountNumber, money - this.money, linkedAccount.accountNumber);
            this.money = 0;
            return true;
        } else {
            System.out.printf("Khong du tien trong tai khoan %d va %d.\n", accountNumber, linkedAccount.accountNumber);
            return false;
        }
    }

    @Override
    public void deposit(long money) {
        if (money > 0) {
            this.money += money;
        }
    }

    @Override
    public void showInfo() {
        System.out.printf("So tai khoan: %d\tSo du: %d\tLinked: %d\n", this.accountNumber, this.money, (this.linkedAccount != null ? this.linkedAccount.getAccountNumber() : 0));
    }

}
