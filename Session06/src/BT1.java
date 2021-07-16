
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
public class BT1 {

    public static void main(String[] args) {
        System.out.println("Find idex of string program: ");
        Scanner sc = new Scanner(System.in);
        String origin, i;
        int index = 0;
        System.out.print("Enter original string: ");
        origin = sc.nextLine();
        System.out.println("Uppercase: " + origin.toUpperCase());
        do {
            System.out.println("Enter the index of extracted character: ");
            i = sc.nextLine();
            if (!"".equals(i)) {
                if (isNumber(i)) {
                    index = (int) Double.parseDouble(i);
                } else {
                    System.out.println("invalid input!");
                }
            } else {
                System.out.println("invalid input!");
            }
            if (index < origin.length() && index >= 0) {
                System.out.format("The %d(th)character:%c\n", index, origin.charAt(index));
                System.out.println("Thank you and have a good day!");
            } else {
                System.out.println("Invalid index comparing to the string!");
            }
        } while (!isNumber(i) || "".equals(i) || index >= origin.length() || index < 0);
    }

    public static boolean isNumber(String a) {

        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(a, pos);
        return a.length() == pos.getIndex();

    }

}
