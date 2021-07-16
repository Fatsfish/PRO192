/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectPkg;

/**
 *
 * @author User
 */
public class Rectangle {

    public int length;/* Code đầu modifier là protected*/
    public int width;

    public void setSize(int l, int w) {
        length = l > 0 ? l : 0;
        width = w > 0 ? l : 0;

    }

}
