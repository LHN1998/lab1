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
public class Bài2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("a= ");
        int a=sc.nextInt();
        System.out.print("b= ");
        int b=sc.nextInt();
        int max, min;
        max=a;
        if(max>b){
            
            System.out.println("max= "+max);
            System.out.println("min= "+b);
        }
        max=b;
        if(max>a)
        {
            System.out.println("max= "+max);
            System.out.println("min= "+a);
        }
    }
    
}
