package com.zcbl.client.zcblsdk.singleton;

/**
 * Created by serenitynanian on 2018/3/13.
 * 饿汉式--无法向单例对象的构造方法传递参数  线程不安全
 */

public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }
}
