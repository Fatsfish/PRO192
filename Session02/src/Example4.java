/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
/* Sự khác nhau giữa 1 dấu & và 2 dấu &&*/
public class Example4 {

    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int c=0;
        int d=3;
        if ((a++ > 10) & (b-- < 5)) {
            System.out.println("A: " + a + "B:  " + b);
        } else {
            System.out.println("A: " + a + "B:  " + b);
        }
        if ((c++ > 10) && (d-- < 5)) {
            System.out.println("C: " + c + "D:  " + d);
        } else {
            System.out.println("C: " + c + "D:  " + d);
        }
    }
/* nếu 1 dấu & thì xét cả 2 nhưng 2 dấu && thì xét điều kiện trước nếu đúng mới xét điều kiện sau*/    
}
