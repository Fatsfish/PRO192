/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
/* cấu trúc switch */
public class Example5 {

    public static void main(String[] args) {
        int age = 10;
        switch (age) {
            case 0:
                System.out.println("Zero");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
