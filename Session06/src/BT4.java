
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
public class BT4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Connecting string program: ");
        String s1, s2, i;
        int r;
        System.out.print("Enter 1st string: ");
        s1 = sc.nextLine();
        System.out.print("Enter 2nd string: ");
        s2 = sc.nextLine();
        System.out.println("String after connect: " + s1.concat(s2) + " and " + s2.concat(s1));
        System.out.print("Have a great day!");

    }
}
