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
public class javaNewClassExvid06 {
    public static void main(String[] args){
    int n,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer:");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    if(n%i==0){
    count++;
    }
    }
    if(count==2){
    System.out.println(n+"is a prime number");
    }
    else{
    System.out.println(n+"is NOT a prime number");
}
    }    
}
