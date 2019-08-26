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
interface ICustomer {

    abstract public Account getAccountByNumber(long number);

    abstract public AccountCard getAccountCardByNumber(long number);

    abstract public AccountSaving getAccountSavingByNumber(long number);

    abstract public void createAccountSaving(long accountNumber);

    abstract public void createAccountCard(long accountNumber);

    abstract public void listAllAcounts();

    abstract public void linked2Aaccounts(long accountCardNumber, long accountSavingNumber);

    abstract public String getName();

    abstract public void setName(String name);

}
