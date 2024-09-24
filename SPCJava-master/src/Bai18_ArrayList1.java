/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Bai18_ArrayList1 {
    public static void main(String[] args) {
        System.out.println("HỌC VỀ ARRAYLIST");
        ArrayList ds = new ArrayList();
        
        for(int i = 1; i < 10; i++) {
        System.out.println("hien thi ArrayList");
        ds.add(i);
        }
        
        ds.add("Hi");
        ds.remove(7);
        
        for(int i = 0; i < ds.size(); i++) {
             System.out.println(ds.get(i) + "");
        }
    }
}
