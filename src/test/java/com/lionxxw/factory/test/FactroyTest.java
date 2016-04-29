package com.lionxxw.factory.test;

import com.lionxxw.factory.ChinaPersonFactory;
import com.lionxxw.factory.PersonFactory;
import com.lionxxw.factory.domain.Man;
import org.junit.Test;

/**
 * <p>Description: 工厂模式测试 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/29 下午3:48
 */
public class FactroyTest {

    @Test
    public void testFactory(){
        PersonFactory factory = new ChinaPersonFactory();
        Man man = factory.getMan();
        man.sayHi();
    }
}
