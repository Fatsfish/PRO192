/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author User
 */
public class Account {

    public String code = "", name = "";
    public double balance = 0;


    //Constructor
    public Account(String c, String n, double b) {
        code = c;
        name = n;
        balance = b > 0 ? b : 0;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void output() {
        System.out.println("Mã tài khoản: " + code);
        System.out.println("Tên tài khoản: " + name);
        System.out.println("Số dư tài khoản: " + balance);

    }
}
