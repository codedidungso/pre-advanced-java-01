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
abstract public class TaiKhoan implements ITaiKhoan {

    protected long stk;
    protected long money;

}

interface ITaiKhoan {

    abstract public void setSTK(long stk);

    abstract public long getSTK();

    abstract public long getMoney();

    abstract public boolean guiTien(long tien);

    abstract public boolean rutTien(long tien);
}
