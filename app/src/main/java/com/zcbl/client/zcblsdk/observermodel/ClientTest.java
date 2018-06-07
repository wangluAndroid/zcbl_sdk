package com.zcbl.client.zcblsdk.observermodel;

/**
 * Created by serenitynanian on 2018/6/7.
 */

public class ClientTest {


    public static void main(String[] args) {
        ConcreteSubject subjectClass = new ConcreteSubject();
        ObserverClass observerClass1 = new ConcreteObserver1("1号观察者",subjectClass);
        ObserverClass observerClass2 = new ConcreteObserver2("2号观察者", subjectClass);


        subjectClass.attach(observerClass1);
        subjectClass.attach(observerClass2);

        subjectClass.setActionStatus("这是一条新通知");
        subjectClass.notifyAllObserver();
    }
}
