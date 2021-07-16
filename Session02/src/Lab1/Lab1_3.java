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
public class Lab1_3 {

    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so kwh: ");
        a = sc.nextLine();
        System.out.println("Ban vưa nhap: " + a);
        if (isNumber(a)) {
            int N = Integer.parseInt(a);
            int T=0, t = 0;
            if (N <= 100) {
                T = N * 1242;
            } else if (N > 100 && N <= 150) {
                T = 100 * 1242 + (N - 100) * 1304;
            } else if (N > 150 && N <= 200) {
                T = 100 * 1242 + 50 * 1304 + (N - 150) * 1651;
            } else if (N > 200) {
                for (int i = 201; i <= N; i++) {
                    t = (i - 200) * (1651+500);
                    t+=(i-201)*500;
                }
                T = 100 * 1242 + 50 * 1304 + 50 * 1651 + t;
            } else {
                System.out.println("So lieu khong ton tai, hay nhap lai!");
            }
            System.out.println("So tien dien la: " + T + " VND");
        } else {
            System.out.println("So lieu khong ton tai, hay nhap lai!");
        }
    }
}
