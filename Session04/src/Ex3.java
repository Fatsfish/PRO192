/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ex3 {

    public static void main(String[] args) {
        Outer out = new Outer();
        out.show();
    }
}

class Outer {   

    public void show() {
        Inner in = new Inner();
        in.display();
    }
}

class Inner {

    public void display() {
        System.out.println("I am an inner class");
    }
}
