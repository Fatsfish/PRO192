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
public class Circle extends Shape{
    double radius=1.0;
    public Circle(){
        
    }
    public Circle(double r){
        radius=r;
    }
    public Circle(double r, String c, boolean f){
       super(c,f);
       radius=r;
    }
      public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
       public double getArea() {
        return radius*radius*Math.PI;
    }

    public double getPerimeter() {
        return radius*2*Math.PI;
    }
      public String toString(){
          System.out.println("Đây là hình tròn!");
        return "Màu sắc: " + color +"; Độ đầy: "+ filled + "; Diện tích: "+ getArea()+ " đơn vị diện tích; Chu vi: "+getPerimeter()+" đơn vị dài";
    }
}
