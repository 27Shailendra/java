/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class NewjavaClass {
public static void main(String[] args){
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Enter the total, or max, score: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Enter the score obtained: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
       
       System.out.println("The percentage is = " + percentage + " %");
//    byte age=35;
//    char ch='a';
//    float f=5.6f;
//    boolean a=true;
//    String str="Harry";
//    
//    System.out.println(a);
//    
//    }
            
    
//}
//public class main_class {
//    public static void main(String[] args){
//       int total, score; 
//       float percentage;
//       Scanner inputNumScanner = new Scanner(System.in);
//       
//       System.out.println("Enter the total, or max, score: ");       
//       total = inputNumScanner.nextInt();
//       
//       System.out.println("Enter the score obtained: ");
//       score = inputNumScanner.nextInt();
//       
//       percentage = (score * 100/ total);
//       
//       System.out.println("The percentage is = " + percentage + " %");
    }
}