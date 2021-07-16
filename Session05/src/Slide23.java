/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public abstract class Slide23 {

    abstract public double circumstances();

    abstract public double area();

}

class Circle extends Slide23 {

    double r;

    public Circle(double rr) {
        r = rr;
    }

    @Override
    public double circumstances() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

}

class Rect extends Slide23 {

    double l, w;

    public Rect(double ll, double ww) {
        l = ll;
        w = ww;
    }

    @Override
    public double circumstances() {
        return 2 * (l + w);
    }

    @Override
    public double area() {
        return l * w;
    }

}
class Program {
    public static void main(String[] args){
        Slide23 s;
        s = new Circle(6);
        System.out.println(s.area());
    }
}