package com.game.box;

import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \普通箱子
 *
 */
public class Common_box implements Box{
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
        return "普通箱子";
    }

    public int getScore() {
        return 1;
    }
}
