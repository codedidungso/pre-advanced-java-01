/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabai;

import java.util.ArrayList;

/**
 *
 * @author thiennd
 */
public class NguoiDung {

    String name;
    ArrayList<TaiKhoan> danhsachthe = new ArrayList<>();

    public NguoiDung(String name) {
        this.name = name;
    }

    public boolean taoTaiKhoanThe(long sotaikhoan) {
        for (int i = 0; i < danhsachthe.size(); i++) {
            if (danhsachthe.get(i).stk == sotaikhoan) {
                return false;
            }
        }

        TaiKhoanThe moi = new TaiKhoanThe(sotaikhoan);
        danhsachthe.add(moi);
        return true;

    }

    public boolean taoTaiKhoanTietKiem(long sotaikhoan) {
        for (int i = 0; i < danhsachthe.size(); i++) {
            if (danhsachthe.get(i).stk == sotaikhoan) {
                return false;
            }
        }

        TaiKhoanTietKiem moi = new TaiKhoanTietKiem(sotaikhoan);
        danhsachthe.add(moi);
        return true;

    }

    public void showInfo() {
        System.out.println("Nguoi dung");
//        for (TaiKhoan taiKhoan : danhsachthe) { // for-each 
//            System.out.println("Tai khoan : "  + taiKhoan.stk);
//        }
        for (int i = 0; i < danhsachthe.size(); i++) {
            System.out.print("Tai khoan : " + danhsachthe.get(i).getSTK()
                    + " so du : " + danhsachthe.get(i).getMoney());

        }
    }

    public TaiKhoan getTaiKhoanBySTK(long stk) {
        for (int i = 0; i < danhsachthe.size(); i++) {
            if (danhsachthe.get(i).getSTK() == stk) {
                return danhsachthe.get(i);
            }
        }
        return null;
    }

    public TaiKhoanThe getTKT(long stk) {
        for (int i = 0; i < danhsachthe.size(); i++) {
            if (danhsachthe.get(i).getClass() == TaiKhoanThe.class) {
                if (danhsachthe.get(i).getSTK() == stk) {
                    return (TaiKhoanThe) danhsachthe.get(i);
                }
            }
        }
        return null;
    }

    public TaiKhoanTietKiem getTKTK(long stk) {
        for (int i = 0; i < danhsachthe.size(); i++) {
            if (danhsachthe.get(i).getClass() == TaiKhoanTietKiem.class) {
                if (danhsachthe.get(i).getSTK() == stk) {
                    return (TaiKhoanTietKiem) danhsachthe.get(i);
                }
            }
        }
        return null;
    }

}
