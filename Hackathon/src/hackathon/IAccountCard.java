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
public interface IAccountCard {

    abstract public void setLinkedAccount(AccountSaving as);

    abstract public AccountSaving getLinkedAccount();
}
