package com.zcbl.client.zcblsdk.observermodel;

/**
 * Created by serenitynanian on 2018/6/7.
 * 观察者
 */

public abstract class ObserverClass {

    protected String name;
    protected SubjectClass subjectClass ;

    /**
     *
     * @param name
     * @param subjectClass 为抽象通知者，减少与具体类的耦合
     */
    public ObserverClass(String name, SubjectClass subjectClass) {
        this.name = name;
        this.subjectClass = subjectClass;
    }

    public abstract void update();

}
