package com.zcbl.client.zcblsdk.singleton;

/**
 * Created by serenitynanian on 2018/3/13.
 * 懒汉式-- 可以给构造函数传递参数  线程不安全
 */

public class LazySingleton {

    private static LazySingleton lazySingleton ;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton ;
    }
}
