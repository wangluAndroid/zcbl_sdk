package com.zcbl.client.zcblsdk.observermodel;


/**
 * Created by serenitynanian on 2018/6/7.
 */

public class ConcreteObserver1 extends ObserverClass {

    public static final String TAG = ConcreteObserver1.class.getSimpleName();
    /**
     * @param name
     * @param subjectClass 为抽象通知者，减少与具体类的耦合
     */
    public ConcreteObserver1(String name, SubjectClass subjectClass) {
        super(name, subjectClass);
    }

    @Override
    public void update() {
        System.out.println(name+"------已经被告知---->"+subjectClass.getActionStatus());
    }
}
