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
public class AccountCard extends Account implements IAccountCard {

    AccountSaving linkedAccountSaving;

    private AccountCard() {
    }

    public AccountCard(String stk) {
        this.stk = stk;
        this.money = 0;
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
        System.out.println("Thong tin tai khoan: STK: " + stk + "; so du: " + money + "; STK lien ket: "
                + (linkedAccountSaving == null ? "Khong co lien ket" : linkedAccountSaving.stk)
        // + bla()
        // condition ? true : false 
        );
    }

    @Override
    public boolean withdraw(int sotien) {
        if (sotien < 0) {
            return false;
        }
        if (sotien > money) {
            if (linkedAccountSaving != null) {
                if (sotien <= linkedAccountSaving.money + this.money) {
                    System.out.println("Rut thanh cong " + money + " tu STK " + stk
                            + " va " + (sotien - money) + " tu STK " + linkedAccountSaving.stk);
                    linkedAccountSaving.withdraw(sotien - money);
                    this.money = 0;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            System.out.println("Rut thanh cong " + sotien + " tu STK " + stk);
            money -= sotien;
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
    public void setLinkedAccountSaving(AccountSaving as) {
        this.linkedAccountSaving = as;
    }

    @Override
    public AccountSaving getLinkedAccountSaving() {
        return this.linkedAccountSaving;
    }

}

interface IAccountCard {

    abstract public void setLinkedAccountSaving(AccountSaving as);

    abstract public AccountSaving getLinkedAccountSaving();

}
