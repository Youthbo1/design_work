package com.game;

import com.game.box.Box;
import com.game.box.BoxNameConstant;
import com.game.factory.Factory;
import com.game.factory.FactoryBuilder;

import javax.swing.*;
import java.awt.*;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class Main {


    public void s() throws Exception{
        Function function = new Function();
        function.put(BoxNameConstant.COMMON_BOX_NAME,new Point(0,0));
        function.put(BoxNameConstant.WELL_LID_BOX,new Point(1,1));
        function.put(BoxNameConstant.MUSIC_BOX,new Point(2,2));
        function.put(BoxNameConstant.MAGIC_BOX,new Point(3,3));
        function.put(BoxNameConstant.CONVENIENCE_STORE,new Point(4,4));

    }


//    public static void main(String[] args) throws Exception {
//        Function function = new Function();
//        function.put(BoxNameConstant.COMMON_BOX_NAME,new Point(0,0));
//        function.put(BoxNameConstant.WELL_LID_BOX,new Point(1,1));
//        function.put(BoxNameConstant.MUSIC_BOX,new Point(2,2));
//        function.put(BoxNameConstant.MAGIC_BOX,new Point(3,3));
//        function.put(BoxNameConstant.CONVENIENCE_STORE,new Point(4,4));
//
//    }
}
