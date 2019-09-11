/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabaihuy;

/**
 *
 * @author thiennd
 */
public class AccountSaving extends Account implements IAccountSaving {

    double interest;

    private AccountSaving() {

    }

    public AccountSaving(String stk) {
        this.stk = stk;
        this.money = 0;
        this.interest = 0.05;
    }

    @Override
    public String getSTK() {
        return this.stk;
    }

    @Override
    public int getMoney() {
        return this.money;
    }

    @Override
    public void kiemTraTaiKhoan() {
        System.out.println("Thong tin tai khoan: STK " + stk + "; so du: " + money + "; tien lai: " + (int) (money * interest));
    }

    @Override
    public boolean withdraw(int sotien) {
        if (sotien < 0) {
            return false;
        }
        if (sotien > money) {
            return false;
        } else {
            System.out.println("Rut thanh cong " + sotien + " tu STK " + stk);
            money -= sotien; // money = money - sotien 
            return true;
        }
    }

    @Override
    public boolean deposit(int sotien) {
        if (sotien < 0) {
            System.out.println("Deposit that bai!");
            return false;
        } else {
            System.out.println("Deposit thanh cong " + sotien + " vao STK " + stk);
            money += sotien;
            return true;
        }
    }

    @Override
    public int getInterestMoney() {
        return (int) (interest * money);
    }

}

interface IAccountSaving {

    abstract public int getInterestMoney();
}
