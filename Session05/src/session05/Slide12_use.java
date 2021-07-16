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
public class Slide12_use {

    public static void main(String[] args) {
        Slide12 obj = new Slide12();
        obj.m();
        obj = new Slide12_son();
        obj.m();
        Slide12_son obj2 = new Slide12_son();
        obj2.m();
    }

}
