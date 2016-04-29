package com.lionxxw.factory;

import com.lionxxw.factory.domain.Man;
import com.lionxxw.factory.domain.Women;
import com.lionxxw.factory.domain.impl.ChinaMan;
import com.lionxxw.factory.domain.impl.ChinaWomen;

/**
 * <p>Description: 中国人创建工厂 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/29 下午3:39
 */
public class ChinaPersonFactory implements PersonFactory {

    public Man getMan() {
        return new ChinaMan();
    }

    public Women getWomen() {
        return new ChinaWomen();
    }
}
