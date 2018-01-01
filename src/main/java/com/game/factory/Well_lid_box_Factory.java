package com.game.factory;

import com.game.box.Box;
import com.game.box.Well_lid_box;
import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Well_lid_box_Factory implements Factory{
    public Box createBox() {
        Well_lid_box well_lid_box=new Well_lid_box();

        Cartoon cartoon=new Cartoon();
        cartoon.setAction("冲水.....");
        well_lid_box.setCartoon(cartoon);

        Shape shape=new Shape();
        shape.setSize("10size");
        well_lid_box.setShape(shape);
        return well_lid_box;
    }
}
