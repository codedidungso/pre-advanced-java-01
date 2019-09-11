/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabai;

/**
 *
 * @author thiennd
 */
public class TaiKhoanThe extends TaiKhoan implements ITaiKhoanThe {

    TaiKhoanTietKiem linkedAccount = null;
    private TaiKhoanThe(){
        
    }
    public TaiKhoanThe(long stkMoi){
        this.stk = stkMoi;
    }
    @Override
    public void setSTK(long stk) {
        this.stk = stk;
    }

    @Override
    public long getSTK() {
        return this.stk;
    }

    @Override
    public long getMoney() {
        return this.money;
    }

    @Override
    public boolean guiTien(long tien) {
        this.money += tien;
        return true;
    }

    @Override
    public boolean rutTien(long tien) {
        if (tien < 0) {
            return false;
        }
        if (tien <= money) {
            money -= tien;
            return true;
        } else if (tien <= money + linkedAccount.getMoney()) {
            // tien = 700 
            // money = 500  - 0
            // tietkiem = 1000 - 800
            linkedAccount.rutTien(tien - money); // 1000.ruttien(700-500) = 800
            money = 0;
            return true;
        };

        return false;
    }

    @Override
    public void setLinkedAccount(TaiKhoanTietKiem tktk) {
        this.linkedAccount = tktk;

    }

}

interface ITaiKhoanThe {

    abstract public void setLinkedAccount(TaiKhoanTietKiem tktk);
}
