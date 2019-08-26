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
public interface IAccount {
    abstract public long getAccountNumber();
    abstract public void setAccountNumber(long accountNumber);
    abstract public long getMoney();
    abstract public boolean withdraw(long money);
    abstract public void deposit(long money);
    abstract public void showInfo();
}
