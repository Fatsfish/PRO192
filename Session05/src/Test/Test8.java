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
//Answer: D/ Compile error
public class Test8 {

    static int N = 2;
    int x = 10;

    static {
        N = 5;
        int y = 7;
        System.out.print("A" + (N + y));
    }

    public void M() {
        System.out.print(x+ y);//Y is in static which is out of scope!
        
    }

    public static void main(String[] args) {
        Test8 obj = new Test8();
        obj.M();
    }

}
