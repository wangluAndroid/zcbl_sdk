package com.zcbl.client.zcblsdk.observermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serenitynanian on 2018/6/7.
 * 主题或抽象通知者，被观察者   一般是一个抽象类或者是一个接口实现
 * 缺点：通知者SubjectClass-----依赖-----观察者ObserverClass
 */

public abstract class SubjectClass {

    //针对抽象编程，减少与具体类的耦合
    private List<ObserverClass> list = new ArrayList<ObserverClass>();

    //被观察者的状态
    private String actionStatus ;


    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    abstract void attach(ObserverClass observerClass);
    abstract void detach(ObserverClass observerClass);
    abstract void notifyAllObserver();


}
