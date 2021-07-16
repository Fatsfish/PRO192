/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session05;

/**
 *
 * @author User
 */
public class LaoCong extends Session05 {

    public double gioLamViec;

    public LaoCong(String hoTen, double luong, double gioLamViec) {
        super(hoTen, luong);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Giờ làm việc: " + gioLamViec);
        System.out.println("Đây là lao công!");
    }
}
