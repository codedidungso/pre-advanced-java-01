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
public class Square extends Shape implements ShapeInterface,ITinhDienTich{

    double canh;

    public Square(double canh) {
       this.canh = canh;
    }


    @Override
    public void tinhChuVi() {
        this.chuVi = canh*4;
    }

    @Override
    public void hienThi() {
        System.out.println("hinh vuong nay co : S= "+this.dienTich+", chu vi = "+this.chuVi);
    }

    @Override
    public void tinhDienTich() {
        this.dienTich = canh*canh;
    }
    
    

}
