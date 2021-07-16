/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class Slide25 {

    void m1() {
        System.out.println("m1");
    }

    abstract void m2();
}

class Derived extends Slide25 {

    @Override//Tất cả abstract method trong abstract class phải được overide!
    public void m2() {
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }

    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}
