package com.zcbl.client.zcblsdk.singleton;

/**
 * Created by serenitynanian on 2018/3/13.
 * 双重检查--- 线程安全需要时可以使用此方法创建单例  线程安全
 * volatile关键字的两层含义
 * 一旦一个共享变量（类的成员变量、类的静态成员变量）被volatile修饰之后，那么就具备了两层语义：
 * 1.保证了不同线程对这个变量进行操作的可见性，既一个线程修改了某个变量，这个变量的新值对其他线程是立即可见的；
 * 2.禁止进行指令重排序；生成的机器指令与字节码指令顺序不一致；
 */

public class DoubleCheckSingleton {
    //volatile
    //线程并发时，当变量被改动了，所有的线程都能及时的访问到最新的数据
    //会屏蔽掉虚拟机的一些优化代码
    private volatile static DoubleCheckSingleton doubleCheckSingleton ;
    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance() {
        if (null == doubleCheckSingleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == doubleCheckSingleton) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton ;
    }

}
