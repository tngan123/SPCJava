
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class De1_Cau2 {
    public static void main(String[] args) {
        System.out.println("Tinh chu vi va dien tich hinh tam giac");
          Scanner sc = new Scanner(System.in);
          double canha, canhb, canhc, s, dientich, chuvi;
          System.out.println("Nhap canh a");
          canha = sc.nextInt();
          System.out.println("Nhap canh b");
          canhb = sc.nextInt();
          System.out.println("Nhap canh c");
          canhc = sc.nextInt();
          s = (canha + canhb + canhc)/2;
          dientich = Math.sqrt(s*(s - canha) * (s - canhb)
          * (s - canhc) );
          chuvi = s * 2;
          System.out.println("Dien tich hinh tam giac: " + dientich);
          System.out.println("Chu vi hinh tam giac: " + chuvi);
}
}
