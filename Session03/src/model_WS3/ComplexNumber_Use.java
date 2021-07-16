/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_WS3;

/**
 *
 * @author User
 */
public class ComplexNumber_Use {

    public static void main(String[] args) {
        ComplexNumber sp1 = new ComplexNumber();
        sp1.input(1);
        ComplexNumber sp2 = new ComplexNumber();
        sp2.input(2);
        ComplexNumber kqc = new ComplexNumber();
        kqc = sp1.add(sp2);
        ComplexNumber kqt = new ComplexNumber();
        kqt = sp1.subtract(sp2);
        ComplexNumber kqn = new ComplexNumber();
        kqn = sp1.multiple(sp2);
        kqc.display("add");
        kqt.display("subtract");
        kqn.display("multiple");

    }

}
