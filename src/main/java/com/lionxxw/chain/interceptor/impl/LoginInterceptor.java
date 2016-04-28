package com.lionxxw.chain.interceptor.impl;

import com.lionxxw.chain.interceptor.Interceptor;
import com.lionxxw.chain.invocation.ActionInvocation;

/**
 * <p>Description: 模拟一个登陆拦截器 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/28 下午5:52
 */
public class LoginInterceptor implements Interceptor {
    public Object intercept(ActionInvocation invocation) {
        System.out.println("login start");
        Object invoke = invocation.invoke();
        System.out.println("login end");
        return invoke;
    }
}
