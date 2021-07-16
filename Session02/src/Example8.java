/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
/*mảng 2 chiều*/
public class Example8 {
    public static void main(String[] args){
        int[] arrInt1 = new int[10];
        int[] arrInt2 = { 2,3,4,5 };
        int[][] arrInt3 = new int[2][3];
        String[] arrString=new String[5];
        ArrayDemo[] arrDemos=new ArrayDemo[5];
        for(int i=0;i<2;i++){
               for(int j=0;j<3;j++){
                    System.out.print(arrInt3[i][j] + " ");
               }
               System.out.println("");
        }
        
    }

    private static class ArrayDemo {

        public ArrayDemo() {
        }
    }
}
