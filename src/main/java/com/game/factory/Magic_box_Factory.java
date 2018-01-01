package com.game.factory;

import com.game.box.Box;
import com.game.box.Magic_box;
import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Magic_box_Factory implements Factory{

    public Box createBox() {
        Magic_box magic_box=new Magic_box();

        Cartoon cartoon=new Cartoon();
        cartoon.setAction("转转转转转转");
        magic_box.setCartoon(cartoon);

        Shape shape=new Shape();
        shape.setSize("30size");
        magic_box.setShape(shape);

        return magic_box;
    }
}
