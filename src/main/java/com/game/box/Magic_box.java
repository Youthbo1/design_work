package com.game.box;

import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \魔方

 */
public class Magic_box implements Box{
    private Cartoon cartoon;
    private Shape shape;

    public Cartoon getCartoon() {
        return cartoon;
    }

    public void setCartoon(Cartoon cartoon) {
        this.cartoon = cartoon;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getName() {
        return "魔方";
    }

    public int getScore() {
        return 10;
    }
}
