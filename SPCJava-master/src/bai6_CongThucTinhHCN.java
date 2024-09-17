


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai6_CongThucTinhHCN {
    public static void main(String[] args) {
        System.out.println("Tinh Hinh Chu Nhat");
        Scanner sc = new Scanner(System.in);
        double ChieuDai, ChieuRong, ChuVi, DienTich;
        System.out.println("Nhap Chieu Dai");
        ChieuDai = sc.nextDouble();
        System.out.println("Nhap Chieu Rong");
        ChieuRong = sc.nextDouble();
        DienTich = ChieuDai * ChieuRong;
        ChuVi = 2 * (ChieuDai + ChieuRong);
        System.out.println("Chu Vi:" + ChuVi);
        System.out.println("Dien Tich:" + DienTich);
    }
}
