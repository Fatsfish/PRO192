/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author User
 */
import static Lab1.Lab1_1.isNumber;
import java.util.Random;
import java.util.Scanner;

public class Lab1_4 {

    public static void main(String[] args) {
        Random rd = new Random();
        int number1 = rd.nextInt(10) + 1;
        String a;
        int N;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen ngau nhien tu 1-10 de test: ");
        a = sc.nextLine();
        System.out.println("Ban vưa nhap: " + a);
        if (isNumber(a)) {
            N = Integer.parseInt(a);
            System.out.println("Test thanh cong, so random la: " + number1);
            System.out.println("Chung ta bat dau thoi!");
            int number2 = rd.nextInt(10) + 1;
            while (N != number2 & i <= 3) {
                for (i = 1; i <= 3; i++) {
                    System.out.print("Nhap so ban yeu thich tu 1-10 lan " + i + ": ");
                    a = sc.nextLine();
                    System.out.println("Ban vưa nhap: " + a);
                    if (isNumber(a)) {
                        N = Integer.parseInt(a);
                        if (N < 1 && N > 10) {
                            System.out.println("The number is not supported, try again!");
                        }
                        if (N == number2) {
                            System.out.println("YOU WON !!! CONGRATULATION !!!");
                        } else {
                            System.out.println("Not correct, try again!");
                        }
                    } else {
                        System.out.println("The input is not supported, try again!");
                    }
                }
            }
            System.out.println("The random number is: " + number2);
            System.out.println("The times trials:" + (i - 1));
            if (N != number2) {
                System.out.println("Better luck next time!");

            }

        } else {
            System.out.println("The input is not supported, try again!");
        }
    }
}
