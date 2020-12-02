/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
//import java.util.Scanner;
public static void main(String[] args) {
        // TODO code application logic here
    double English,Hindi,Maths,Science,Moral;
    //float Percent;
    // Name;
    System.out.println("Mark sheet of student:-");
     Scanner sc= new Scanner(System.in);
    System.out.print("Name of student:-");
    String Name =sc.nextLine();
    System.out.print("Enter English Marks-");
    English =sc.nextInt();
    System.out.print("Enter Hindi marks-");
    Hindi=sc.nextInt();  
    System.out.print("Enter Maths marks-");
    Maths=sc.nextInt(); 
    System.out.print("Enter Science marks-");
    Science=sc.nextInt(); 
    System.out.print("Enter Moral marks-");
    Moral=sc.nextInt(); 
    double f= ((English+Hindi+Maths+Science+Moral)/5); 
    System.out.println("Your CBSC board percentage is:"+f+"%");

    } 
    
}
