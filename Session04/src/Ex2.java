/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ex2 {
    static int N=10;
    int x,y;
    public Ex2(int xx, int yy){
        x=xx;
        y=yy;
    }
    public void setN( int nn){
        N=nn;
    }
    public void output(){
        System.out.println(N+","+x+","+y);
    }
}
