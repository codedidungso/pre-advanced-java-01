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
abstract public class Account implements IAccount {

    protected String stk;
    protected int money;
}

interface IAccount {

    abstract public String getSTK();

    abstract public int getMoney();

    abstract public void kiemTraTaiKhoan();

    abstract public boolean withdraw(int sotien);

    abstract public boolean deposit(int sotien);
}
