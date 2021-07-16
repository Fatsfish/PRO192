/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ex2_use {

    public static void main(String[] args) {
        Ex2 obj1 = new Ex2(5, 7);
        Ex2 obj2 = new Ex2(4, 6);
        obj1.output();
        obj2.output();
        obj1.setN(9999);
        obj1.output();
        obj2.output();
        System.out.println(Ex2.N);
    }

}

