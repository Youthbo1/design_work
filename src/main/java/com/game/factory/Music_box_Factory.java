package com.game.factory;

import com.game.box.Box;
import com.game.box.Music_box;
import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Music_box_Factory implements Factory{

    public Box createBox() {
        Music_box music_box=new Music_box();
        Cartoon cartoon=new Cartoon();
        cartoon.setAction("放音乐.....");
        music_box.setCartoon(cartoon);

        Shape shape=new Shape();
        shape.setSize("25size");
        music_box.setShape(shape);
        return music_box;
    }
}
