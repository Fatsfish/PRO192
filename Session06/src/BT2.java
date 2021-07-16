
import java.text.NumberFormat;
import java.text.ParsePosition;
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
public class BT2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String comparing program: ");
        String s1, s2, i;
        int r;
        System.out.print("Enter 1st string: ");
        s1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        s2 = sc.nextLine();
        System.out.println("Result: ");
        r = s1.compareTo(s2);
        if (r > 0) {
            System.out.println("OK");
        }
        if (r < 0) {
            System.out.println("KO");
        }
        if (r == 0) {
            System.out.println("EQUALS");
        }

        System.out.println("Have a great day!");
    }
}
