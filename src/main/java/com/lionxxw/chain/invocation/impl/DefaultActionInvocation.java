package com.lionxxw.chain.invocation.impl;

import com.lionxxw.chain.action.BaseAction;
import com.lionxxw.chain.interceptor.Interceptor;
import com.lionxxw.chain.interceptor.impl.LoginInterceptor;
import com.lionxxw.chain.interceptor.impl.RightInterceptor;
import com.lionxxw.chain.interceptor.impl.RoleInterceptor;
import com.lionxxw.chain.invocation.ActionInvocation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Description: 模拟struts2责任链模式 </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/28 下午5:58
 */
public class DefaultActionInvocation implements ActionInvocation {

    private Iterator<Interceptor> iterator; // 声明所有的拦截器的迭代器的形式
    private Object result = null;

    public DefaultActionInvocation(){
        // 初始化拦截器
        init();
    }

    private void init() {
        /**
         * 创建一个拦截器集合
         */
        List<Interceptor> interceptors = new ArrayList<Interceptor>();
        /**
         * 将定义的拦截器,添加到拦截器集合中
         */
        LoginInterceptor loginInterceptor = new LoginInterceptor();
        RightInterceptor rightInterceptor = new RightInterceptor();
        RoleInterceptor roleInterceptor = new RoleInterceptor();
        interceptors.add(loginInterceptor);
        interceptors.add(rightInterceptor);
        interceptors.add(roleInterceptor);
        this.iterator = interceptors.iterator();
    }


    public Object invoke() {
        /**
         * 判断是否有下一个拦截器
         */
        if (iterator.hasNext()){
            /**
             * 如果有,先返回下一个拦截器
             */
            Interceptor interceptor = iterator.next();
            result = interceptor.intercept(DefaultActionInvocation.this);
        }else{
            result = executeAction();
        }
        return result;
    }

    private Object executeAction(){
        return new BaseAction().execute();
    }
}
