package com.brady.designpatten.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Intranet aSwitch = (Intranet)Proxy.newProxyInstance(Switch.class.getClassLoader()
                , Switch.class.getInterfaces(), new BlackListFilter(new Switch()));
        aSwitch.fileAccess("\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        aSwitch.fileAccess("\\192.68.1.2\\共享1\\游戏\\Hero.exe");
        aSwitch.fileAccess("\\192.68.1.4\\shared\\Java学习资料.zip");
        aSwitch.fileAccess("\\1192.68.1.6\\)Java\\)设计模式" +
                "" +
                "" +
                ".doc");
    }
}
