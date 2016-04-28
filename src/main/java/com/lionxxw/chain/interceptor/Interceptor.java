package com.lionxxw.chain.interceptor;

import com.lionxxw.chain.action.BaseAction;
import com.lionxxw.chain.invocation.ActionInvocation;

/**
 * <p>Description: 拦截器总接口 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/28 下午5:35
 */
public interface Interceptor {
    Object intercept(ActionInvocation invocation);
}
