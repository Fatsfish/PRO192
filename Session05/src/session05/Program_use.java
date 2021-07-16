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
public class Program_use {

    public static void main(String[] args) {
        TruongPhong nv1 = new TruongPhong("Truong", 500, 100);
        nv1.xuat();
        System.out.println();
        LaoCong nv2 = new LaoCong("Truong", 100, 70);
        nv2.xuat();
        System.out.println();
        Session05 nv3 = new Session05("Truong", 50);
        nv3.xuat();
        System.out.println();

    }

}
