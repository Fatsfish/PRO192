
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
public class BT3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding string program: ");
        String s1, s2, i;
        int r;
        System.out.print("Enter Origin string: ");
        s1 = sc.nextLine();
        System.out.print("Enter Sub string: ");
        s2 = sc.nextLine();
        if (s1.contains(s2)) {
            System.out.println("The substring is founded,áds the result is true!");
        } else {
            System.out.println("Cannot found the substring, the result is false!");

        }
    }
}
