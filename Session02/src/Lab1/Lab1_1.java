/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import java.lang.System;
import java.lang.String;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab1_1 {

    public static void main(String[] args) {
        String a, b;
        double c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so chi dong ho dien cua thang truoc: ");
        b = sc.nextLine();
        System.out.print("Nhap so chi dong ho dien cua thang sau: ");
        a = sc.nextLine();
        System.out.println("Ban vưa nhap 2 chuoi:  " + b + "  " + a);
        if (isNumber(a) && isNumber(b)) {
            d = Double.parseDouble(a);
            c = Double.parseDouble(b);
            if (d > c) {
                double t = (d - c);
                System.out.println("So kwh da su dung:  " + t);
            } else {
                System.out.println("Chi so dong ho khong hop le moi nhap lai!");
            }
        } else {
            System.out.println("Chi so dong ho khong hop le moi nhap lai!");
        }
    }

    public static boolean isNumber(String a) {

        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(a, pos);
        return a.length() == pos.getIndex();

    }
}
