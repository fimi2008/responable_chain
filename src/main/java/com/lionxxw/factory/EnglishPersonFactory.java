package com.lionxxw.factory;

import com.lionxxw.factory.domain.Man;
import com.lionxxw.factory.domain.Women;
import com.lionxxw.factory.domain.impl.EnglishMan;
import com.lionxxw.factory.domain.impl.EnglishWomen;

/**
 * <p>Description: 英国人创建工厂 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/29 下午3:40
 */
public class EnglishPersonFactory implements PersonFactory {
    public Man getMan() {
        return new EnglishMan();
    }

    public Women getWomen() {
        return new EnglishWomen();
    }
}
