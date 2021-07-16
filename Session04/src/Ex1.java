/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ex1 extends Ex1_1 {

    public static void main(String[] args) {
        Ex1 u = new Ex1();
        u.show();
    }

    @Override
    void show() {
        System.out.println("Show of Ex2");
    }
}

class Ex1_1 {

    void show() {
        System.out.println("Show of tutorial 35");
    }
}
