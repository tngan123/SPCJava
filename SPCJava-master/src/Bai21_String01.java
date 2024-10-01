/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Bai21_String01 {
    public static void main(String[] args) {
        System.out.println("BAI TAP VE STRING");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten");
        String hovaten = sc.nextLine();
        //Nguyen Thi Tuyet Ngan
        System.out.println("Ho: " + hovaten.substring(0, 6));
        System.out.println("Chu lot: " + hovaten.substring(7, 16));
        System.out.println("Ten: " + hovaten.substring(17));
        
        System.out.println("HO VA TEN IN HOA: " + hovaten.toUpperCase());
        System.out.println("DO DAI: " + hovaten.length());
        
    }
}
