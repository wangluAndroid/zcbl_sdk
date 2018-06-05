package com.zcbl.client.zcblsdk.proxymodel;

/**
 * Created by serenitynanian on 2018/2/8.
 * Proxy类：保存一个引用，使得代理可以访问实体，并实现一个相同的接口，这样代理就可以用来代替实体；
 */

public class Proxy extends Subject {
    private RealSubject realSubject ;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }

    private void test(int a, int b) {

    }
}
