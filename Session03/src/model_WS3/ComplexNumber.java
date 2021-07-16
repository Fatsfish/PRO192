/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_WS3;

import static Lab1.Lab1_1.isNumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComplexNumber {

    private double phanThuc;
    private double phanAo;

    public ComplexNumber() {
    }

    public ComplexNumber(double a, double b) {
        this.phanThuc = a;
        this.phanAo = b;
    }

    public void input(int i) {
        String testReal, testNotReal;
        System.out.println("Nhập số phức " + i + ": ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần thực: ");
        testReal = sc.nextLine().toUpperCase();
        if (isNumber(testReal)) {
            phanThuc = Double.parseDouble(testReal);
        } else {
            System.out.println("Số vừa nhập không hợp lệ, phần thực mặc định là 0 đã được khởi tạo!");
            phanThuc = 0;
        }
        System.out.print("Nhập phần ảo: ");
        testNotReal = sc.nextLine().toUpperCase();
        if (isNumber(testNotReal)) {
            phanAo = Double.parseDouble(testNotReal);
        } else {
            System.out.println("Số vừa nhập không hợp lệ, phần ảo mặc định là 0 đã được khởi tạo!");
            phanAo = 0;
        }
    }
// Phương thức xuất

    public void display() {
        System.out.println("Kết quả số phức: " + phanThuc + "   + " + "i*" + phanAo);
    }

    public void display(String function) {
        if (function == "add") {
            System.out.println("Kết quả phép cộng: " + phanThuc + "   + " + "i*" + phanAo);
        }
        if (function == "subtract") {
            System.out.println("Kết quả phép trừ: " + phanThuc + "   + " + "i*" + phanAo);
        }
        if (function == "multiple") {
            System.out.println("Kết quả phép nhân " + phanThuc + "   + " + "i*" + phanAo);
        }
    }

    public ComplexNumber add(ComplexNumber cNumber) {
        double RR = this.phanThuc + cNumber.phanThuc;
        double RnR = this.phanAo + cNumber.phanAo;
        return new ComplexNumber(RR, RnR);
    }

    public ComplexNumber subtract(ComplexNumber cNumber) {
        double RR = this.phanThuc - cNumber.phanThuc;
        double RnR = this.phanAo - cNumber.phanAo;
        return new ComplexNumber(RR, RnR);
    }

    public ComplexNumber multiple(ComplexNumber cNumber) {
        double RR = this.phanThuc * cNumber.phanThuc - this.phanAo * cNumber.phanAo;
        double RnR = this.phanThuc * cNumber.phanAo - this.phanAo * cNumber.phanThuc;
        return new ComplexNumber(RR, RnR);
    }
}
