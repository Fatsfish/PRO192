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

   public class TruongPhong extends Session05 {

    public double trachNhiem;

    public TruongPhong(String hoTen, double luong, double trachNhiem) {
        super(hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Trach Nhiem: "+ trachNhiem);
        System.out.println("Đây là trưởng phòng!");
    }
   
}
