
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai4_Cacpheptinhcoban {
    public static void main(String[] args) {
        System.out.println("Cac phep tinh co ban");
          Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so a");
            int a = sc.nextInt();
            System.out.print("Nhap so b");
            int b = sc.nextInt();
             System.out.println("Hieu");
         int hieu = a - b;
            System.out.println(a + " - " + b + " = " + hieu);
            System.out.println("Tong");
            int tong=a+b;
             System.out.println(a + " + " + b + " = " + tong);
              System.out.println("Tich");
            int tich = a * b;
            System.out.println(a + " * " + b + " = " + tich);
            double thuong=(double) a/b;
            System.out.println(a+"/"+b+"="+thuong(a,b));
    }
    private static int tong(int a, int b) {
        return a+b;
    }
      private static int hieu(int a, int b) {
        return a-b;
}
        private static int tich(int a, int b) {
        return a*b;
        }
          private static String thuong(int a, int b) {
        if(b==0) {
            return"khong the chia cho 0";
          }
           else {
    return Double.toString((double)a/b);
}
}
}

8
