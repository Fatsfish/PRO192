/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class Slide29 {

    public void M1() {
        System.out.println("M1");
    }

    public void M2() {
        System.out.println("M2");
    }

}

class Program1 {

    public static void main(String[] args) {
        Slide29 obj = new Slide29() {

            @Override
            public void M1() {
                System.out.println("M1 overridden");
            }
        };
        obj.M2();
        obj.M1();
    }
}
