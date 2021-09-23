/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author Welcome
 */
public class Bài1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int a;
        //float f;
        //double d;
        //long l;
        //char c;
        //String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int a= sc.nextInt();
        System.out.print("Nhập một số thực: ");
        float f=sc.nextFloat();
        System.out.print("Nhập một số kiểu double: ");
        double d=sc.nextDouble();
        System.out.print("Nhập một số kiểu long: ");
        long l=sc.nextLong();
        sc.nextLine();
        System.out.print("Nhập một số kiểu kí tự: ");
        char c=sc.nextLine().charAt(0);
        System.out.print("Nhập một số kiểu chuỗi: ");
        String s=sc.nextLine();
        System.out.println("a= "+a);
        System.out.println("f= "+f);
        System.out.println("d= "+d);
        System.out.println("l= "+l);
        System.out.println("c= "+c);
        System.out.println("s= "+s);
    }
    
}
