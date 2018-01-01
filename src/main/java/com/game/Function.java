package com.game;

import com.game.box.Box;
import com.game.factory.Factory;
import com.game.factory.FactoryBuilder;

import java.awt.*;
import java.util.ArrayList;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Function {
    public  ArrayList<String> a=new ArrayList<String>();
    public String s;
    public void put(String name,Point p) throws Exception {
        Factory factory = FactoryBuilder.buildByClassName(name);
        Box box = factory.createBox();
        System.out.println(box.getName() + "  放在(" + p.x+","+p.y + ")上");
        s=box.getName() + "  放在(" + p.x+","+p.y + ")上";

        a.add(s);

    }

}
