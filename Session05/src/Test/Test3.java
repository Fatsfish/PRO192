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
//Answer: D/ AB and error
public class Test3 {

    public static void main(String[] args) {
        Study_3A obj = new Study_3A();
        obj.M();
        obj = new Study_3B();
        obj.M();
        Object obj2 = new Study_3C(); // 3A and 3C are inconvertible so does Object.
        ((Study_3A)obj2).M();
    }

}

class Study_3A {//extends Object Kế thừa class object của java để chạy được

    void M() {
        System.out.print("A");
    }
}

class Study_3B extends Study_3A {

    @Override
    void M() {
        System.out.print("B");
    }
}

class Study_3C{// extends Study_3A nếu ko kế thừa thì khởi tạo đối tượng bị lỗi hoặc cast trực tiếp lớp C

    void M() {
        System.out.print("C");
    }
}
