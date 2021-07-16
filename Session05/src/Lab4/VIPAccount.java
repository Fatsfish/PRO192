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
public class VIPAccount extends Account {

    boolean promotion;
    public VIPAccount(boolean p, String c, String n, double b) {
        super(c, n, b);
        promotion = p;
    }


    public boolean getPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public void output() {
        System.out.println("Mã tài khoản: " + code);
        System.out.println("Tên tài khoản: " + name);
        System.out.println("Số dư tài khoản: " + balance);
        System.out.println("Trạng thái promotion: " + promotion);
    }
}
