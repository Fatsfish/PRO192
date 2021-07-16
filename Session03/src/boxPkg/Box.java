/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxPkg;

import rectPkg.Rectangle;

/**
 *
 * @author User
 */
public class Box extends Rectangle {

    int height;
    protected int price;
    public int weight; /* Code đầu modifier là private */

    void setSize(int l, int w, int h) {
        super.setSize(l, w);
        height = h > 0 ? h : 0;
    }

    int volume() {
        return length * width * height;
    }
}
