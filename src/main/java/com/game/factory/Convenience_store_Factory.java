package com.game.factory;

import com.game.box.Box;
import com.game.box.Convenience_store;
import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Convenience_store_Factory implements Factory{

    public Box createBox() {
        Convenience_store convenience_store=new Convenience_store();

        Cartoon cartoon=new Cartoon();
        cartoon.setAction("钉，我是便利店");
        convenience_store.setCartoon(cartoon);

        Shape shape=new Shape();
        shape.setSize("20size");
        convenience_store.setShape(shape);

        return convenience_store;
    }
}
