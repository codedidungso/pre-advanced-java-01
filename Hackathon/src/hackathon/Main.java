/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathon;

import javax.swing.JFrame;

/**
 *
 * @author thiennd
 */
public class Main {
    public static final int THIEN = 18;
    public static final boolean NAM = true;
    public static final boolean NU = false;
    
    public static void main(String[] args) {
        boolean gender = NAM;
        boolean gender2 = NU;
        
        Customer thien = new Customer();
        thien.setName("Thien");

        thien.createAccountCard(1234567890123L);
        thien.createAccountCard(1000000000123L);
        thien.createAccountSaving(1234567890456L);

        thien.getAccountByNumber(1234567890123L).deposit(1000);
        thien.getAccountByNumber(1234567890456L).deposit(1000);
        thien.getAccountByNumber(1000000000123L).deposit(1000);

        thien.getAccountCardByNumber(1234567890123L).
                setLinkedAccount(
                        thien.getAccountSavingByNumber(1234567890456L));

        thien.getAccountCardByNumber(1234567890123L).withdraw(1500);
        thien.getAccountByNumber(1000000000123L).withdraw(1500);

        thien.listAllAcounts();
        
        Integer k = new Integer("123");
        
    }

}
