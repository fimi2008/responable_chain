package com.lionxxw.factory;

import com.lionxxw.factory.domain.Man;
import com.lionxxw.factory.domain.Women;
import com.lionxxw.factory.domain.impl.JapanMan;
import com.lionxxw.factory.domain.impl.JapanWomen;

/**
 * <p>Description: 日本人创建工厂 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/29 下午3:41
 */
public class JapanPersonFactory implements PersonFactory {
    public Man getMan() {
        return new JapanMan();
    }

    public Women getWomen() {
        return new JapanWomen();
    }
}
