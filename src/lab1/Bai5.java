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
public class Bai5 {
    int n;
    public int getN()
    {
        return n;
    }
    void nhap()
    {
        boolean check=false;
        Scanner sc =new Scanner(System.in);
        do {            
            try {
                System.out.println("Nhap vao n: ");
                n=Integer.parseInt(sc.nextLine());
                check=true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Hay nhap dung kieu du lieu"+e.toString());
                check=false;
            }
        } while (check=false);
    }
    float Tinhtong(int a)
    {
        float tong1=0;
        for(int i=1;i<=a;i++)
        {
            tong1+=1.0/i;
        }
        return tong1;
    }
    float Tinhtong2(int a){
        float tong2=0;
        int giaithua=1;
        for (int i=1;i<=a;i++) {
            giaithua*=i;
            tong2+=1.0/giaithua;
        }
        return tong2;
        
   
    }
    void Menu(){
            System.out.println("1 Nhap vao so nguyen duong n");
            System.out.println("2 Tinh tong :1+....+1/n");
            System.out.println("3 Tinh tong :1+....+1/n!");
            System.out.println("4 Thoat");

    }

    public static void main(String[] args) {
        Bai5 bai5=new  Bai5();
        int n=0;
        Scanner sc =new Scanner(System.in);
        do {            
            boolean check =false;
            do {                
                bai5.Menu();
                try {
                    System.out.println("Nhap vao cac lua chon: ");
                    n=Integer.parseInt(sc.nextLine());
                    check=true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("hay nhap dung kieu du lieu"+e.toString());
                    check=false;
                }
            } while (check==false);
            switch(n){
                case 1: 
                {bai5.nhap();
                    break;}
                case 2:{
                    if(bai5.getN()==0)
                        System.out.println("Ban chua nhap n! Hoac de n bang 0");
                    else
                        System.out.println("tong :1+....+1/n la: "+bai5.Tinhtong(bai5.getN()));
                    break;
                }
                case 3:{
                     if(bai5.getN()==0)
                        System.out.println("Ban chua nhap n! Hoac de n bang 0");
                     else
                        System.out.println("tong :1+....+1/n! la: "+bai5.Tinhtong2(bai5.getN()));
                    break;
                }
                case 4:
                    break;
                default:
                    System.out.println("Khong co lua chon cua ban");
                    break;
            }
            
        } while (n!=4);
}
}