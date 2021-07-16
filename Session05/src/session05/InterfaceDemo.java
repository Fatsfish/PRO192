/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05;

/**
 *
 * @author User
 */
public interface InterfaceDemo {

    final int MAXN = 100;
    int n = 0;

    static public int sqrt(int x) {
        return x * x;
    }

    public abstract void m1();

    public abstract void m2();

    void m3();

    void m4();

}

class Slide20 implements InterfaceDemo {

    public void m1() {
        System.out.println("M1");
    }

    public void m2() {
        System.out.println("M2");
    }

    public void m3() {
        System.out.println("M3");

    }

    public void m4() {
        System.out.println("M4");

    }

}

class UseIT {

    public static void main(String args[]) {
        InterfaceDemo obj = new Slide20();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        int s = InterfaceDemo.sqrt(5);
        System.out.println("5x5=" + s);
    }
}
