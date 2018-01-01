package com.game.factory;

import com.game.box.BoxNameConstant;

/**
 * \Date: 2018/1/1
 * \
 * \Description:
 * \
 */
public class FactoryBuilder {
    public static Factory build(String name) {
        Factory factory = null;
        if(BoxNameConstant.COMMON_BOX_NAME.equals(name)) {
            factory = new Common_box_Factory();
        } else if (BoxNameConstant.CONVENIENCE_STORE.equals(name)) {
            factory = new  Convenience_store_Factory();
        } else if (BoxNameConstant.MAGIC_BOX.equals(name)) {
            factory = new Magic_box_Factory();
        }else if (BoxNameConstant.MUSIC_BOX.equals(name)) {
            factory = new Music_box_Factory();
        }else if (BoxNameConstant.WELL_LID_BOX.equals(name)) {
            factory = new Well_lid_box_Factory();
        }
        return factory;
    }

    public static Factory buildByClassName(String name) throws Exception {
        return (Factory)Class.forName(name).newInstance();
    }
}
