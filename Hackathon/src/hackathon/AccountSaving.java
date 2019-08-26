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
public class AccountSaving extends Account implements IAccountSaving {

    private double interest = 0.05;

    private AccountSaving() {

    }

    AccountSaving(long accountNumber) {
        this.accountNumber = accountNumber;
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
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean withdraw(long money) {
        if (money <= this.money) {
            this.money -= money;
            System.out.printf("Rut thanh cong %d tu tai khoan %d.\n", money, accountNumber);
            return true;
        } else {
            System.out.printf("Khong du %d trong tai khoan %d.\n", accountNumber);
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
        System.out.printf("So tai khoan: %d\tSo du: %d\tLai suat: %.2f\n", this.accountNumber, this.money, this.money * this.interest);
    }

    @Override
    public double getInterest() {
        return this.interest;
    }

}
