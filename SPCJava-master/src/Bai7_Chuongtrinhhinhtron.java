/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai7_Chuongtrinhhinhtron {
    public static void main(String[] args) {
        System.out.println("Chuong trinh hinh tron");
        Scanner sc = new Scanner(System.in);
        double BanKinh, ChuVi, DienTich;
        System.out.println("Nhap ban kinh");
        BanKinh = sc.nextDouble();
        ChuVi = 2 * (Math.PI + BanKinh);
        DienTich = Math.PI * (BanKinh *2);
        System.out.println("Chu Vi:" + ChuVi);
        System.out.println("Dien Tich:" + DienTich);
    }
}
