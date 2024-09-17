/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9_Bangcuuchuong;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai9_Bangcuuchuong {
    public static void main(String[] args) {
        System.out.println("Bang Cuu Chuong");
        Scanner sc = new Scanner (System.in);
       System.out.print("Nhap Cuu Chuong");
        int a;
        a = sc.nextInt();    
           for (int i = 1; i <= 10; i++)    
            {
                  System.out.println(a+"x"+i+"="+a*i);
            }   
              
        
    }
}
