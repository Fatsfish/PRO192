/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import static Lab1.Lab1_1.isNumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab1_2 {

    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        a = sc.nextLine();
        System.out.println("Ban vưa nhap so nguyen: " + a);
        if (isNumber(a)) {
            long N = Integer.parseInt(a);
            long t, r = 0;
            while (N != 0) {
                t = N % 10;
                r = r * 10 + t;
                N /= 10;
            }
            System.out.println("So nguyen dao nguoc la: " + r);
        } else {
            System.out.println("So nguyen N khong hop le, moi nhap lai!");
        }
    }
}
