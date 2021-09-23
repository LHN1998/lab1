/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Welcome
 */
public class Bài4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n,t;
        System.out.println("Nhap so dien: ");
        n=sc.nextInt();
        if(n<50)
            t=n*5000;
        else
            t=50*5000+(n-50)*1200;
        System.out.println("Tien dien: "+t+"đ");
    }
}
