/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class BT2 {
    public static void main(String[] args){
        int n = 0;
        int c[]= new int[n];
        int d[]= new int[n];
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao so tu nhien N:");
        n= sc.nextInt();
        if(n%2==0){
            int a = 0,b = 0;
            for(int i=0;i<=n;i++){
                if(i%2==0){
                    a+=i;
                }
                  if(i%2==1){
                    b+=i;
                }      
            }
             System.out.println("Tong cac so chan la:" +a);
             System.out.println("Tong cac so le la:" +b);  
        }
    }
}
