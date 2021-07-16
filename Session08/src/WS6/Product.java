/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

import static WS6.Menu.isNumber;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Product {

     String code = "", name = "";
     int make = 0;
     double price = 0;

    public Product() {
    }

    //Constructor
    public Product(String c, String n, int m, double p) {
        code = c;
        name = n;
        make = m > 0 ? m : 0;
        price = p > 0 ? p : 0;

    }

    // Getters and Setters - Lấy và Gán
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Phương thức nhập thông tin của 1 người
    public void input() {
        String testMake;
        String testPrice;
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã của sản phẩm: ");
        code = sc.nextLine();
        System.out.print("Nhập tên của sản phẩm: ");
        name = sc.nextLine();
         do {
            System.out.print("Nhập số lượng của sản phẩm được nhập: ");
            testMake= sc.nextLine().toUpperCase();
            if (!"".equals(testMake)) {
                if (isNumber(testMake)) {
                    if (Double.parseDouble(testMake) >= 0) {
                        make = (int) Double.parseDouble(testMake);
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } else {
                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
            }
        } while (make < 0 || !isNumber(testMake) || "".equals(testMake));

        do {
            System.out.print("Nhập giá của sản phẩm được nhập: ");
            testPrice= sc.nextLine().toUpperCase();
            if (!"".equals(testPrice)) {
                if (isNumber(testPrice)) {
                    if (Double.parseDouble(testPrice) >= 0) {
                        price = Double.parseDouble(testPrice);
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } else {
                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
            }
        } while (price < 0 || !isNumber(testPrice) || "".equals(testPrice));
    }

    // Phương thức xuất
    public String toString() {
        return "Mã sản phẩm: " + code + "; Tên sản phẩm: " + name + "; Số lượng: " + make+"; Giá: "+price;
    }

}
