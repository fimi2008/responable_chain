package com.lionxxw.chain.action;

/**
 * <p>Description: 一个action </p>
 *
 * @author wangxiang
 * @version 1.0
 * @time 16/4/28 下午5:36
 */
public class BaseAction {

    public Object execute(){
        System.out.println("baseAction");
        return "hello";
    }
}
