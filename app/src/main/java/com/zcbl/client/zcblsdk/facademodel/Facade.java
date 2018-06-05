package com.zcbl.client.zcblsdk.facademodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 外观模式
 * 外观类：它需要了解所有子系统的方法或属性，进行组合，以备外界调用
 */

public class Facade {

    SubSystemOne subSystemOne ;
    SubSystemTwo subSystemTwo ;
    SubSystemThree subSystemThree ;

    public Facade() {
        this.subSystemOne = new SubSystemOne();
        this.subSystemTwo = new SubSystemTwo();
        this.subSystemThree = new SubSystemThree();
    }


    public void methodOne(){
        System.out.println("--------执行方法组One------");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();

    }

    public void methodTwo(){
        System.out.println("--------执行方法组Two------");
        subSystemOne.methodOne();
        subSystemThree.methodThree();

    }

    public void methodThree(){
        System.out.println("--------执行方法组Three------");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();

    }


}
