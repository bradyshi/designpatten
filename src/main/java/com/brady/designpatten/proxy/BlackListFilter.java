package com.brady.designpatten.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackListFilter implements InvocationHandler {
    private Object origin;

    private List<String> blackList = Arrays.asList("电影","游戏","音乐","小说");

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤功能");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        String arg = args[0].toString();
        for (String s : blackList) {
            if(arg.contains(s)) {
                System.out.println("禁止访问" + arg);
                return null;
            }
        }
        System.out.println("校验通过。。。。");
        return method.invoke(origin, args);
    }
}
