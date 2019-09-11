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
public class TaiKhoanTietKiem extends TaiKhoan implements ITaiKhoanTietKiem {

    private double interest = 0.5;

    private TaiKhoanTietKiem() {

    }

    public TaiKhoanTietKiem(long stkMoi) {
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
        if (tien > this.money) {
            return false;
        } else {
            this.money -= tien;
            return true;
        }
    }

    @Override
    public void setInterest(double i) {
        this.interest = i;
    }
    
    @Override
    public double getInterest() {
        return this.interest;
    }
}

interface ITaiKhoanTietKiem {

    abstract public void setInterest(double i);
    abstract public double getInterest();
    
}
