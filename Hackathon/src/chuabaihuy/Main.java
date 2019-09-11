/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabaihuy;

import java.util.Arrays;

/**
 *
 * @author thiennd
 */
public class Main {

    public static void main(String[] args) {
        Customer thien = new Customer("Thien Nguyen Duc");
        thien.createAccountCard("123");
        thien.createAccountSaving("456");

        AccountCard thienAC = thien.getAccountCardBySTK("123");
        AccountSaving thienAS = thien.getAccountSavingBySTK("4456");

        if (thienAC == null) {
            System.out.println("KHong co tai khoan the");

        } else {
            if (thienAC.deposit(1000)) {
                //    System.out.println("Deposit successful 1000");
                thien.showInfo();
            };
            if (thienAC.withdraw(300)) {
                //  System.out.println("Withdraw successful 300");
                thien.showInfo();

            };
            if (thienAS != null) {
                thienAC.setLinkedAccountSaving(thienAS);
                System.out.println("Linked " + thienAC.getSTK() + " with " + thienAS.getSTK());
            }
        }

        if (thienAS == null) {
            System.out.println("Khong co tai khoan tiet kiem");
        } else {
            if (thienAS.deposit(2000)) {
                //System.out.println("Deposit successful 2000");
                thien.showInfo();
            }
            if (thienAS.withdraw(400)) {
                //System.out.println("Withdraw successful 400");
                thien.showInfo();
            };

        }

        if (thienAC != null) {
            thienAC.withdraw(1500);
        }
        thien.showInfo();
        PS a = new PS();
        PS b = new PS();
        
        PS[] listPS = new PS[10];
        for (int i = 0; i < 10; i++) {
            listPS[i] = new PS();
            listPS[i].tu = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(listPS[i].tu + "; ");
        }
        System.out.println("=====");
        Arrays.sort(listPS);
        for (int i = 0; i < 10; i++) {
            System.out.println(listPS[i].tu + "; ");
        }
        
    }

}

class PS implements Comparable<PS>{

    int tu;
    int mau;

    @Override
    public int compareTo(PS o) {
        // 0 bang nhau
        // >0 lon hon
        // <0 nho hon
        return -this.tu + o.tu;
    }
    PS plus(PS a) {
        PS temp = new PS();
        temp.tu = a.tu + this.tu;
        return temp;
    }

}
