/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS6;

/**
 *
 * @author User
 */
public class BusinessAccount extends Account {

    double interestRate;

    public BusinessAccount(String c, String n, double b, double i) {
        super(c, n, b);
        interestRate = i >= 0 ? i : 0;

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void output() {
        System.out.println("Mã tài khoản: " + code);
        System.out.println("Tên tài khoản: " + name);
        System.out.println("Số dư tài khoản: " + balance);
        System.out.println("Lãi suất xay: " + interestRate);
    }

}
