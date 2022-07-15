/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Program {
    public ArrayList<Student> ds; // tao 1 o nho la chuoi arraylist de dua ds doi tuong vao.

    public Program() {
        ds = new ArrayList<Student>(); // 1 o nho de trong chua co gi
    }
    
    public void adds(){ /// phai dua input vao ds nay thi moi dua vao arraylist tong dc
        Student sv= new Student();
    Scanner sc= new Scanner(System.in);
        System.out.println("input id: ");
        sv.setId(sc.nextLine());
        System.out.println("input full name: ");
        sv.setFullname(sc.nextLine());
        System.out.println("input age: ");
        sv.setAge(sc.nextDouble());
    
        ds.add(sv); // moi lan nhap la add vao list
    }
    public void save(){ // luu danh vao file roi xoa list de lan luu sau list se trong ko bi luu ds cu nua.
   
    
        FileOutputStream fos= null;
        ObjectOutputStream oos=null;
        
        try {
            fos= new FileOutputStream("D:\\java\\Vanban\\Students.dat");
            oos= new ObjectOutputStream(fos);
            
            oos.writeInt(ds.size());
            for(int i=0;i<ds.size();i++){
            oos.writeObject(ds.get(i));
            }
            ds.clear(); // xoa list 
            System.out.println("ghi tep thanh xong");
        } catch (FileNotFoundException ex) {
            System.out.println("co loi mo tep de ghi");
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("co loi");
        }
        finally{
            try {
                fos.close();
                oos.close();
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }
    public void Display(){
       
        FileInputStream fis= null;
        ObjectInputStream ois=null;
        
        try {
            fis= new FileInputStream("D:\\java\\Vanban\\Students.dat");
            ois = new ObjectInputStream(fis);
            int n= ois.readInt();
            ds.clear();
            for(int i=0;i<n;i++){
            Student sv= (Student)ois.readObject();
            ds.add(sv); // dua ds vao list de hien thi
            }
            System.out.println("Hien thi ds sv: "+n);
             System.out.println("Display all students");
        System.out.println("  EnrollID      Fullname      Age");
        System.out.println("    ----------    --------    -----");
            
            for(Student sv: ds){ // hien thi ds list 
                System.out.println(sv);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("loi ko doc dc tep");
            Logger.getLogger(Program.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        finally{
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
