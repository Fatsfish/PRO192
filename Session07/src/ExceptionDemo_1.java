/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ExceptionDemo_1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 10;
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("" + a[i] + ",");
            }
        } catch (Exception e) {
            System.out.println("The program is error and this why this sentence is up here!!!!!!");
            System.out.println("The a has only 5 elements which are:"+ a);
        }

    }

}
