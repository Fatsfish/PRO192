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
//Answer: D/Compile time error Static code can not access instance variable
public class Test7 {
    static int N = 10;
    int x = 120;// object variable can not be accessed by static 

    static {
        N = 7;
        System.out.print("A"+N);
        x=500;//Instance if lose can run!
    }

    public void M() {
        System.out.print(x);
    }

    public static void main(String[] args) {
        Test7 obj = new Test7();
        obj.M();
    }

    
}
