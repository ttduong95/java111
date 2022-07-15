/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    public String Id;
    public String Fullname;
    public double Age;

    public Student() {
    }

    public Student(String Id, String Fullname, double Age) {
        this.Id = Id;
        this.Fullname = Fullname;
        this.Age = Age;
    }
    
    
    public void display(){
        System.out.println(Id+", "+Fullname+" , "+Age);
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return  "    "+ Id + "           " + Fullname + "         " + Age ;
    }
    
}
