package CaseStudy2;

import java.util.Scanner;
import java.util.Vector;
/**
 * date: 09/06/2020
 *
 * @author Kyro
 */
public class Menu {

    String[] hints;
    int n = 0; // current numbers of hints
    // create a menu with size elements

    public Menu(int size) {
        if (size < 1) {
            size = 10;
        }
        hints = new String[size];
    }

    // add a hint
    public void add(String aHint) {
        if (n < hints.length) {
            hints[n++] = aHint;
        }
    }

    //get user choice
    public int getChoice() {
        int result = 0;
        if (n > 0) {
            //print out hints
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + "-" + hints[i]);
            }
//Create Exception error while choosing the menu input.
            while (true) {
                try {
                    do{
                    System.out.print("Please select an operation: ");
                    Scanner sc = new Scanner(System.in);
                    result = Integer.parseInt(sc.nextLine());
                    if ((result<1) | (result>6)) System.out.println("Invalid number! Please try again");
                    } while ((result<1) | (result>6));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input format! Please try again");
                }
            }
        }
        return result;
    }
}
