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
public class Bài3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a,b,c,delta,x1,x2;
        do {            
            System.out.print("a= ");
            a=sc.nextInt();
            if(a==0)
                System.out.println("Nhập lại a ");
        } while (a==0);
        System.out.print("b= ");
        b=sc.nextDouble();
        System.out.print("c= ");
        c=sc.nextDouble();
        delta=b*b-4*a*c;
        if(delta<0)
        {
            System.out.println("Phương trình vô nghiệm.");
        }
        if(delta==0)
        {
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+(-b)/(2*a));
            
        }
        else{
            x1=(-b+Math.sqrt(delta))/(2*a);
            x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1= "+x1);
            System.out.println("x2= "+x2);
        }
    }
    
}
