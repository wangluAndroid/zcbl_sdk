package com.zcbl.client.zcblsdk.singleton;


/**
 * Created by serenitynanian on 2018/3/13.
 * 枚举的方式创建单例
 * java设计者建议使用的最优方法，参数和安全都可以自己控制；--《Effective Java》 java高效编程
 */

public enum  EnumSingleton {

    instance(1,"参数");

    private int index ;
    private String params ;

    //参数可控的
    EnumSingleton(int index, String params) {
        this.index = index ;
        this.params = params ;
    }
    public void operate(){
        System.out.println("------operate------");
    }
}
