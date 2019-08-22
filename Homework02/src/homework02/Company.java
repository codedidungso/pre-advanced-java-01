/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework02;

import java.util.ArrayList;

/**
 *
 * @author thiennd
 */
public class Company {
    
    ArrayList<Employee> dsnv = new ArrayList<>();
    int soLuongMax = 10;
    Employee emmmmm = new Employee();
    
    public void addNewEmployee(Employee e) {
        if (dsnv.size() > soLuongMax) {
            System.out.println("So luong nhan vien toi da!");
            return;
        }
        System.out.println("Da them 1 nhan vien");
        dsnv.add(e);
        
        
    }
    
    public void showList() {
        
        for (int i = 0; i < dsnv.size(); i++) {
//            a[i]
            System.out.println(dsnv.get(i).name);
        }
    }
}
