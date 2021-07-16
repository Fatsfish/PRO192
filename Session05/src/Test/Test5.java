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
//Answer: D: Compile time error due to type violation
public class Test5 {
     public static void main(String[] args) {
        Study_5C obj = new Study_5C();//Sữa thành 5A //5C sẽ bị lỗi con
        obj.M();
        obj =  new Study_5B();
        obj.M();
        obj =  new Study_5A(); // 5A and 5C are inconvertible
        obj.M();
    }

}

class Study_5A {

    void M() {
        System.out.print("A");
    }
}

class Study_5B extends Study_5A {

    @Override
    void M() {
        System.out.print("B");
    }
}

class Study_5C extends Study_5B { //must herritage when using 5A

    @Override
    void M() {
        System.out.print("C");
    }
    
}
