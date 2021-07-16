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
public class Department {

    private String deptName;
    private double numberofEmp;
    private Employee[] listEmp;

    public Department() {

    }

    public void input() {
        String testNumber, testOut = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phòng ban: ");
        deptName = sc.nextLine();
        do {
            System.out.println("Nhập số lượng nhân viên");
            testNumber = sc.nextLine();
            if (!"".equals(testNumber)) {
                if (isNumber(testNumber)) {
                    if (Double.parseDouble(testNumber) >= 0) {
                        if (Double.parseDouble(testNumber) > 10000000) {
                            System.out.println("Số vừa nhập phải bé hơn 10000000, số 10000000 đã được khởi tạo!");
                            numberofEmp = 10000000;
                        } else {
                            numberofEmp = Double.parseDouble(testNumber);
                        }
                    } else {
                        System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                        numberofEmp = Double.parseDouble(testNumber);
                    }
                } else {
                    System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
                }
            } else {
                System.out.println("Số vừa nhập không hợp lệ, mời nhập lại!");
            }
        } while (numberofEmp < 0 || !isNumber(testNumber) || "".equals(testNumber));
        int i = 0;
        listEmp = new Employee[(int) numberofEmp];
        do {
            if (numberofEmp <= 0) {
                System.out.println("Cảm ơn bạn đã sử dụng chương trình, không có nhân viên nào để nhập cả!");
                testOut = "QUIT";
            } else {
                if (i == (int) numberofEmp) {
                    testOut = "QUIT";
                }
                System.out.println("Hãy nhập một ký tự bất kì để tiếp tục chương trình!");
                System.out.print("Nếu bạn buồn quá và không muốn nhập nữa thì hãy bấm câu lệnh 'quit' nhe!: ");
                testOut = sc.nextLine().toUpperCase();

                if ("QUIT".equals(testOut)) {
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    numberofEmp = i;
                    System.out.println("Danh sách chứa " + numberofEmp + " nhan vien!");
                } else {
                    if (i < numberofEmp) {
                        System.out.println("Mời bạn tiếp tục chương trình: ");
                        Employee emp = new Employee();
                        emp.input();
                        listEmp[i] = emp;
                        ++i;
                        if (i >= numberofEmp) {
                            testOut = "QUIT";

                        }
                    } else {
                        testOut = "QUIT";
                    }
                }
            }
        } while (!"QUIT".equals(testOut) || i < (int) numberofEmp);
    }

    public void display() {
        System.out.println("Thông tin phòng ban " + deptName);
        if (numberofEmp == 0) {
            System.out.println("Danh sách trống!");
        } else {
            for (int i = 0; i < numberofEmp; i++) {
                System.out.println("Thông tin nhân viên " + (i + 1));
                listEmp[i].display();
            }
        }
    }

    public double getMaxSalary() {
        double max = 0;
        if (numberofEmp != 0) {
            for (int i = 0; i < numberofEmp; i++) {
                if (max < listEmp[i].salary) {
                    max = listEmp[i].salary;
                }
            }
        }
        return max;
    }
}
