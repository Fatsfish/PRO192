/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class SinhVien {

    String Ten;
    String Diem;
    String XepLoai;
    String c;

    public SinhVien() {
        input();
        output();
    }

    public SinhVien(String a, String b) {
        this.Ten = a;
        this.Diem = b;
        XepLoai(this.Diem);
        output();
    }

    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên sinh viên: ");
        this.Ten = sc.nextLine();
        System.out.println("Bạn vừa nhập: " + this.Ten);
        System.out.print("Nhập điểm của sinh viên: ");
        this.Diem = sc.nextLine();
        System.out.println("Bạn vừa nhập: " + this.Diem);
        XepLoai(this.Diem);
    }

    private String XepLoai(String Diem) {
        if (isNumber(Diem)) {
            double d;
            d = Double.parseDouble(Diem);
            if (d == 10) {
                XepLoai = "Xuất sắc";
            }
            else if (d < 10 && d >= 0) {
                if (d >= 8) {
                    XepLoai = "Giỏi";
                }
                if (d >= 6.5 && d < 8) {
                    XepLoai = "Khá";
                }
                if (d >= 5 && d < 6.5) {
                    XepLoai = "Trung Bình";
                }
                if (d >= 3 && d < 5) {
                    XepLoai = "Yếu";
                }
                if (d < 3) {
                    XepLoai = "Kém";
                }
            } else {
                XepLoai = "Điểm không hợp lệ - Không có xếp loại";
                System.out.println("Điểm không hợp lệ!");
                System.out.println("Mời nhập lại!");
            }
        } else {
            XepLoai = "Điểm không hợp lệ - Không có xếp loại";
            System.out.println("Điểm không hợp lệ!");
            System.out.println("Mời nhập lại!");
        }
        return XepLoai;
    }

    private void output() {
        System.out.println("Họ và tên: " + Ten + "; Điểm: " + Diem + "; Xếp loại: " + XepLoai);
    }

    void Printlist() {
        System.out.println("Họ và tên: " + Ten + "; Điểm: " + Diem + "; Xếp loại: " + XepLoai);
    }
  public static boolean isNumber(String a) {

        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(a, pos);
        return a.length() == pos.getIndex();

    }}