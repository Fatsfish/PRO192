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
public class Electric extends Product {

    int guaranty;
    int voltage;
    double power;

    public Electric() {
    }

    //Constructor
    public Electric(int g, int v, double p, String c, String n, int m, double pp) {
        super(c, n, m, pp);
        guaranty = g > 0 ? g : 0;
        voltage = v > 0 ? v : 0;
        power = p > 0 ? p : 0;

    }

    public int getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(int guaranty) {
        this.guaranty = guaranty;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    // Phương thức nhập thông tin của 1 người
    public void input() {
        System.out.println("Đây là sản phẩm điện!");
        String testMake;
        String testPrice;
        String testy;
        String testv;
        String testp;
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã của sản phẩm: ");
        code = sc.nextLine();
        System.out.print("Nhập tên của sản phẩm: ");
        name = sc.nextLine();
        do {
            System.out.print("Nhập số lượng của sản phẩm được nhập: ");
            testMake = sc.nextLine().toUpperCase();
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
            testPrice = sc.nextLine().toUpperCase();
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
        do {
            System.out.print("Nhập điện áp của sản phẩm được nhập: ");
            testv = sc.nextLine().toUpperCase();
            if (!"".equals(testv)) {
                if (isNumber(testv)) {
                    if (Double.parseDouble(testv) >= 0) {
                        voltage = (int) Double.parseDouble(testv);
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } else {
                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
            }
        } while (voltage < 0 || !isNumber(testv) || "".equals(testv));
        do {
            System.out.print("Nhập số năm bảo hành của sản phẩm được nhập: ");
            testy = sc.nextLine().toUpperCase();
            if (!"".equals(testy)) {
                if (isNumber(testy)) {
                    if (Double.parseDouble(testy) >= 0 && Double.parseDouble(testy) <= 10) {
                        guaranty = (int) Double.parseDouble(testy);
                    } else {
                        System.out.println("Số năm vừa nhập không hợp lệ, số năm bảo hành phải ít hơn 10 năm, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } else {
                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
            }
        } while (guaranty < 0 || !isNumber(testy) || "".equals(testy));
        do {
            System.out.print("Nhập công suất của sản phẩm được nhập: ");
            testp = sc.nextLine().toUpperCase();
            if (!"".equals(testp)) {
                if (isNumber(testp)) {
                    if (Double.parseDouble(testp) >= 0) {
                        power = Double.parseDouble(testp);
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } else {
                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
            }
        } while (power < 0 || !isNumber(testp) || "".equals(testp));

    }

    // Phương thức xuất
    public String toString() {
        return "Mã sản phẩm: " + code + "; Tên sản phẩm: " + name + "; Số lượng: " + make + "; Giá: " + price + "; Số năm bảo hành: " + guaranty + "; Số điện áp: " + voltage + "; Số công suất: " + power;
    }

}
