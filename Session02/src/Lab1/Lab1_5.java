/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.util.Scanner;
import static Lab1.Lab1_1.isNumber;

/**
 *
 * @author User
 */
public class Lab1_5 {

    public static void main(String[] args) {
        String n;
        String a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n so nguyen muon nhap: ");
        n = sc.nextLine();
        if (isNumber(n)) {
            int N = Integer.parseInt(n);
            a = new String[N];
            int c = 0, l = 0, nt = 0, k = 0, nd = 0;
            for (int i = 0; i < N; i++) {
                System.out.println("Nhap vao cac so nguyen duong: ");
                a[i] = sc.next();
            }
            for (int i = 0; i < N; i++) {
                if (isNumber(a[i])) {
                    int d = Integer.parseInt(a[i]);
                    if (d % 2 == 0) {
                        c += 1;
                    }
                    if (d % 2 == 1) {
                        l += 1;
                    }
                    if (d == 0) {
                        k += 1;
                    }
                    if (d > 0) {
                        nd += 1;
                    }
                    if (isPrime(d)) {
                        nt += 1;
                    }
                }
            }
            System.out.println("So so chan la: " + c);
            System.out.println("So so le la: " + l);
            System.out.println("So so nguyen duong la: " + nd);
            System.out.println("So so khong la: " + k);
            System.out.println("So so nguyen to la: " + nt);

        } else {
            System.out.println("So n khong hop le moi nhap lai!");
        }
    }

    public static boolean isPrime(int d) {
        if (d <= 1) {
            return false;
        }
        if (d > 1) {
            for (int i = 2; i <= Math.sqrt(d); i++) {
                if (d % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
