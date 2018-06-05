package com.zcbl.client.zcblsdk.templatemodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 模板方法模式
 */

public abstract class AbstractTemplate {

    /**
     * 一些抽象的具体行为，延迟到子类中去实现
     */
    public abstract void primitiveOperateOne();
    public abstract void primitiveOperateTwo();

    /**
     * 模板方法：给出了逻辑的骨架，而逻辑的组成是一些抽象的操作，
     *          具体的实现延迟到子类中；
     *
     *  备注：骨架整体调用逻辑不能修改，但是能够根据不同的需求；
     */
    public void templateMethod(){
        primitiveOperateOne();
        primitiveOperateTwo();
        System.out.println("执行了模板方法");
    }

}
