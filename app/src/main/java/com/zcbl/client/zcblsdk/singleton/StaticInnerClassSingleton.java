package com.zcbl.client.zcblsdk.singleton;

/**
 * Created by serenitynanian on 2018/3/13.
 * 静态内部类创建单例---无法给构造函数传递参数，线程安全
 */

public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class SingletonHolder{
        //注意：静态内部类的静态属性实例化时，是由JVM保证线程的安全---虚拟机的机制
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    //只有调用了getInstance方法之后，才会实例化StaticInnerClassSingleton
    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.instance ;
    }
}
