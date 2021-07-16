
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BT1 {
    public static void main (String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap vao so tu nhien N be hon 20:");
        n= sc.nextInt();
        if(n<20){
            int a = 1;
            for(int i=1; i<=n;++i){
                a*=i;
            }
            System.out.println("Ket qua giai thua:  " + a );
        }
        else{
            System.out.println("So da nhap lon hon 20! hoac khong phai so!");
        }
    }
}
