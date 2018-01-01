package com.game.factory;

import com.game.box.Box;
import com.game.box.Common_box;
import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Common_box_Factory implements Factory{
    public Box createBox() {

        Common_box common_box=new Common_box();

        Cartoon cartoon=new Cartoon();
        cartoon.setAction("没动画");
        common_box.setCartoon(cartoon);

        Shape shape=new Shape();
        shape.setSize("5size");
        common_box.setShape(shape);

        return common_box;
    }
}
