package com.lionxxw.chain;

import com.lionxxw.chain.invocation.impl.DefaultActionInvocation;
import org.junit.Test;

/**
 * <p>Description: 测试责任链模式 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/28 下午6:08
 */
public class TestAction {

    @Test
    public void testAction(){
        DefaultActionInvocation action = new DefaultActionInvocation();
        Object invoke = action.invoke();
        System.out.println("返回结果:"+invoke);
    }
}
