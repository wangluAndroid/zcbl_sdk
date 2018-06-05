package com.zcbl.client.zcblsdk.buldermodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 指挥者类
 */

public class Director {

    /**
     * 用来指挥建造过程
     * @param builder
     */
    public void concreateBuilder(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
