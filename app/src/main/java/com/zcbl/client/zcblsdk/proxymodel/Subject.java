package com.zcbl.client.zcblsdk.proxymodel;

/**
 * Created by serenitynanian on 2018/2/8.
 * Subject :定义了RealSubject和Proxy的共用接口，这样在任何使用RealSubject的地方都可以使用Proxy.
 */

public abstract class Subject {

    public abstract void request();
}
