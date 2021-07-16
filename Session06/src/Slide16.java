/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Slide16 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1==s2: " + (s1 == s2));
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println("s3==s4: " + (s3 == s4));
        System.out.println("s3 equals s4: " + (s3.equals(s4)));
        String s5 = new String(new char[]{'H', 'E', 'L', 'L', 'O'});
        System.out.println("s3 equals s5 ignoring case: " + (s3.equalsIgnoreCase(s5)));
        System.out.println(s5);
        s5 = s5.toLowerCase();
        System.out.println(s5);
    }
}
