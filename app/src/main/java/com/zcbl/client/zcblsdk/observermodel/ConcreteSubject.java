package com.zcbl.client.zcblsdk.observermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serenitynanian on 2018/6/7.
 */

public class ConcreteSubject extends SubjectClass {

    //针对抽象编程，减少与具体类的耦合
    private List<ObserverClass> list = new ArrayList<ObserverClass>();



    /**
     * 添加观察者
     * @param observerClass  //针对抽象编程，减少与具体类的耦合
     */
    @Override
    public void attach(ObserverClass observerClass) {
        if (null != list) {
            list.add(observerClass);
        }
    }

    /**
     * 移除观察者
     * @param observerClass //针对抽象编程，减少与具体类的耦合
     */
    @Override
    public void detach(ObserverClass observerClass) {
        if (null != list) {
            list.remove(observerClass);
        }
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyAllObserver() {

        for (int i = 0; i < list.size(); i++) {
            ObserverClass observerClass = list.get(i);
            observerClass.update();
        }

    }
}
