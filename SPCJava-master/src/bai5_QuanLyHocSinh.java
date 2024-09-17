
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class bai5_QuanLyHocSinh {
    public static void main(String[] args) {
        System.out.println("Truong Trinh Quan Ly Hoc Sinh");
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap Ho Va Ten");
        String hoten = sc.nextLine();
       
        System.out.println("Nhap Nam Sinh Cua Ban");
        int namsinh = sc.nextInt();
        
        System.out.println("Chao Ban" + hoten);
        int tuoi = 2024 - namsinh;
        System.out.println("Tuoi Cua ban La " + tuoi);
        
                
    }
}
