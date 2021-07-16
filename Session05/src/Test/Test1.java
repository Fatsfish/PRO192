/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author User
 */
//Answer: D/compile time error // Đáp án đúng là ABC
public class Test1 {

    public static void main(String[] args) {
        Study_1A obj = new Study_1A();
        obj.M();
        obj = new Study_1B();
        obj.M();
        obj = new Study_1C(); // 1A and 1C are inconvertible
        obj.M();
    }

}

class Study_1A {

    void M() {
        System.out.print("A");
    }
}

class Study_1B extends Study_1A {

    @Override
    void M() {
        System.out.print("B");
    }
}

class Study_1C{ //must herritage when using 1A //extends Study_1A

    @Override
    void M() {
        System.out.print("C");
    }
}
