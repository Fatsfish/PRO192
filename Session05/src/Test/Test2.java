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
//Answer: D/compile runtime error // ABC
public class Test2 {

    public static void main(String[] args) {
        Object obj = new Study_2A(); //Object class does not have M()
        obj.M();//        ((Study_2A)obj).M(); class cast
        obj = new Study_2B();
        obj.M();
        obj = new Study_2C(); 
        obj.M();
    }

}
class Study_2A {//extends Object để cast class hoặc không cần

    void M() {
        System.out.print("A");
    }
}

class Study_2B extends Study_2A {

    @Override
    void M() {
        System.out.print("B");
    }
}

class Study_2C {//Heritage the M(); //extends Study_2A
    void M() {
        System.out.print("C");
    }
    
}
