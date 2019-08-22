/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework02;

/**
 *
 * @author thiennd
 */
public class Person {

    int id;
    String name;
    private int yearOfBirth;
//    String gender
    boolean isMale;

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String getGender(){
        if(isMale) return "Male";
        else return "Female";
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
}
