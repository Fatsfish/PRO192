
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class PhanSo {

    public double tuso, mauso;

    //Constructor
    public PhanSo(double t, double m) {
        tuso = t;
        mauso = m != 0 ? m : Math.pow(10, -12);
    }

    public double getTuso() {
        return tuso;
    }

    public void setTuso(double tuso) {
        this.tuso = tuso;
    }

    public double getMauso() {
        return mauso;
    }

    public void setMauso(double mauso) {
        this.mauso = mauso;
    }

    public void output() {
        System.out.println("Tử: " + tuso);
        System.out.println("Mẫu: " + mauso);
        System.out.println("Phân số: " + tuso + "/" + mauso + "=" + (tuso / mauso));

    }

}

class SuDungPhanSo extends Vector<PhanSo> {

    public SuDungPhanSo() {
        super();
    }

    public void add() {
        Double ts = null, ms = null;
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            try {
                System.out.print("  Tử số: ");
                ts = Double.parseDouble(sc.nextLine());
                System.out.print(" Mẫu số: ");
                ms = Double.parseDouble(sc.nextLine());
                i = 1;
            } catch (Exception e) {
                System.out.println("Phân số không hợp lệ, hãy kiểm tra lại!");
                i = -1;
            }
        } while (i == -1);
        this.add(new PhanSo(ts, ms));
        System.out.println("Phân số đã được thêm!");
    }

    public void add(double ts, double ms) {
        this.add(new PhanSo(ts, ms));
        System.out.println("Phân số đã được thêm!");

    }

    public void print() {
        if (this.size() == 0) {
            System.out.println("Empty List.");
            return;
        }

        System.out.println("\nDS PHAN SO");
        System.out.println("----------------------------");
        for (PhanSo x : this) {
            System.out.println("Phân số thứ: " + (this.indexOf(x) + 1));
            x.output();
        }
    }

    public static void main(String[] args) {
        SuDungPhanSo dsPhanSo = new SuDungPhanSo();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            dsPhanSo.add(rd.nextDouble(), rd.nextDouble());
        }
        dsPhanSo.print();
        System.out.println("Phân số trùng với 1/8");
        if ("1/8".equals(dsPhanSo)) {
            dsPhanSo.print();
        } else {
            System.out.println("Không có phân số nào trùng");
        }
        int count = 0;
        SuDungPhanSo v = new SuDungPhanSo();
        Vector c = new Vector();
        System.out.println("Các phân số khác nhau:");
        for (int i = 0; i < 10; i++) {
            if (!v.contains(dsPhanSo.elementAt(i))) {
                v.add(dsPhanSo.elementAt(i));
                count += 1;
                c.add(Collections.frequency(dsPhanSo, dsPhanSo.elementAt(i)));
            } else if (v.contains(dsPhanSo.elementAt(i))) {
                c.add(v.indexOf(dsPhanSo.elementAt(i)), Collections.frequency(dsPhanSo, dsPhanSo.elementAt(i)));
            }

        }
        System.out.println("Số phân số khác nhau: " + count);
        v.print();
        System.out.println("Số lần xuất hiện của từng phân số: " + c);

        System.out.println("Sắp xếp phân số");
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > i; j--) {
                if ((dsPhanSo.elementAt(j).tuso / dsPhanSo.elementAt(j).mauso) < (dsPhanSo.elementAt(j - 1)).tuso / dsPhanSo.elementAt(j - 1).mauso) {
                    double tt = dsPhanSo.elementAt(j - 1).tuso;
                    double mt = dsPhanSo.elementAt(j - 1).mauso;
                    dsPhanSo.elementAt(j - 1).tuso = dsPhanSo.elementAt(j).tuso;
                    dsPhanSo.elementAt(j - 1).mauso = dsPhanSo.elementAt(j).mauso;
                    dsPhanSo.elementAt(j).tuso = tt;
                    dsPhanSo.elementAt(j).mauso = mt;
                }
            }
        }
        System.out.println("Sau khi sắp xếp phân số: ");
        dsPhanSo.print();
    }

}
