/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class pro {
    public static int menu(){
        int chon;
        System.out.println("Moi chon chuc nang 1-4: ");
        System.out.println("1.Add new Student");
        System.out.println("2.Save");
        System.out.println("3.Display all student");
        System.out.println("4.Exit");
        System.out.println("chon: ");
        Scanner sc = new Scanner(System.in);
        chon=sc.nextInt();
        return chon;
    }
     public static void main(String[] args){
         Program pros=new Program();
        
        int n;
        do{
        n=menu();
        switch(n){
            case 1: 
                pros.adds();
                break;
            case 2: pros.save();break;
            case 3: pros.Display();break;
            case 4: System.out.println("Goodbye");break;
            default: System.out.println("choose the wrong function");
                
                
        }
        }while(n!=4);
     }
}
