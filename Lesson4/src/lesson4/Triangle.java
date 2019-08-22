/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author thiennd
 */
public class Triangle extends Shape implements ShapeInterface{

    double e1, e2, e3; // edge
    Triangle(double e1, double e2, double e3){
        // ===
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }


    @Override
    public void tinhChuVi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hienThi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //Viet 1 chuong trinh quan ly 1 danh sach sinh vien 
    //1 sinh vien gom 4 thuoc tinh: ten , mssv, dob( o dang Date), gioi tinh
    //Viet chuong trinh them 1 sinh vien vao danh sach da co
    //Xoa, Update sinh vien dua theo mssv
    //Hien thi ra cac sinh vien 
    //Tim kiem sinh vien theo mssv
}

