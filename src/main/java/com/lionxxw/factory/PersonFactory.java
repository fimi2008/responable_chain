package com.lionxxw.factory;

import com.lionxxw.factory.domain.Man;
import com.lionxxw.factory.domain.Women;

/**
 * <p>Description: 人类创建工厂 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/29 下午3:36
 */
public interface PersonFactory {

    Man getMan();

    Women getWomen();
}
