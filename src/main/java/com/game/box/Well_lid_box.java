package com.game.box;

import com.game.component.Cartoon;
import com.game.component.Shape;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \井盖Magic_box_Factory
 */
public class Well_lid_box implements Box{
    private Cartoon cartoon;
    private Shape shape;

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Cartoon getCartoon() {

        return cartoon;
    }

    public void setCartoon(Cartoon cartoon) {
        this.cartoon = cartoon;
    }

    public String getName() {
        return "井盖";
    }

    public int getScore() {
        return 5;
    }
}
