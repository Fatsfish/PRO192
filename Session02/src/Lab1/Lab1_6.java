/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import static Lab1.Lab1_1.isNumber;
import static Lab1.Lab1_5.isPrime;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab1_6 {

    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        a = sc.nextLine();
        System.out.println("Ban vưa nhap: " + a);
        if (isNumber(a)) {
            int N = Integer.parseInt(a);
            int r, i,n=0, b = 0;
            int s[] = new int[N];
            for (i = 0; i < N; i++) {
                r = isPow(i);
                if (isPrime(r)) {
                    System.out.println("Tong binh phuong cua chu so " + i + ":  " + r);
                    n+=1;
                    s[n] = i;
                    b=n;
                }
            }
            if (b == 0) {
                System.out.println("Khong co so nao thoa dieu kien!");
            }
            if (b > 0) {
                System.out.print("Cac so do la:  ");
                for ( i = 1; i<= n; i++) {
                    System.out.format("%5d", s[i]);
                }
                System.out.println();

            }
        } else {
            System.out.println("So nguyen N khong hop le, moi nhap lai!");
        }
    }

    public static int isPow(int i) {
        int t, r = 0;
        while (i != 0) {
            t = i % 10;
            r += (int) Math.pow(t, 2);
            i /= 10;
        }
        return r;
    }
}

