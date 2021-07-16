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
public class HinhTron extends HinhHoc {
    double mBanKinh;
    public HinhTron(){}
    public HinhTron(double b){
        mBanKinh =b;
    }
    @Override
     public String XemChuViDienTich(){
         System.out.println("Đây là hình tròn!");
        return"Diện tích hình tròn: " + Math.pow(mBanKinh, 2)*Math.PI +"; Chu vi hình tròn: "+ mBanKinh*2*Math.PI;
    }
}
