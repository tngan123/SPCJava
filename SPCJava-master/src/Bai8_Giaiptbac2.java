/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai8_Giaiptbac2 {
    public static void main(String[] args) {
        System.out.println("chương trinh phuong trinh bac2");
                        Scanner sc= new Scanner (System.in);

        double a,b,c,delta,x1,x2;
        System.out.print("Nhap a:");
           a = sc.nextDouble();
        System.out.print("Nhap b:");
           b = sc.nextDouble();
        System.out.print("Nhap c:");
           c = sc.nextDouble();
           if(a==0)
           {
              if(b==0)
              {
                  if(c!=0)
                  {
                      System.out.println("phuong trinhvo nghiem");
                  }
                  else{
                      System.out.println("phuong trinh co vo so nghiem ");
                  }
              }
              else{
                  x1=x2= -c/b;
                  System.out.println("phuong trinh co nghiem x="+x1);
              }
           }
           else{
               delta=b*b-4*a*c;
               if(delta<0){
                   System.out.println("phuong trinh vo nghiem");
               }
               else if (delta == 0){
                   x1 =x2=-b / (2*a);
                   System.out.println("phuong trinhco nghiem kep x1=x2"+x1);
                   
               }
               else{
               x1 = (-b+ Math.sqrt(delta))/(2*a);
               x2 = (-b- Math.sqrt(delta))/(2*a);
               System.out.println("phuong trinh co 2 nghiem phan biet");
               System.out.println("x1"+x1);
               System.out.println("x2"+x1);
               }
           }
    }
}
