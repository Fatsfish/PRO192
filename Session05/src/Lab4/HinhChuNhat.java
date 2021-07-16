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
public class HinhChuNhat extends HinhHoc {
    double mChieuDai;
    double mChieuRong;

    public HinhChuNhat ( double w, double l) {
        mChieuDai = l;
        mChieuRong = w;
        mDienTich=getArea();
        mChuVi=getPerimeter();
    }
    
     public double getWidth() {
        return mChieuRong;
    }

    public void setWidth(double mChieuRong) {
        this.mChieuRong = mChieuRong;
    }

    public double getLength() {
        return mChieuDai;
    }

    public void setLength(double mChieuDai) {
        this.mChieuDai=mChieuDai;
    }

    public double getArea() {
        return mChieuDai*mChieuRong;
    }

    public double getPerimeter() {
        return 2 * (mChieuDai+ mChieuRong);
    }
    @Override
     public String XemChuViDienTich(){
         System.out.println("Đây là hình chữ nhật!");
        return"Diện tích hình chữ nhật: " + mDienTich +"; Chu vi hình chữ nhật: "+ mChuVi;
    }
}
