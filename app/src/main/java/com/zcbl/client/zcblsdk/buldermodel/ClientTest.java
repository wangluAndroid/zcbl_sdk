package com.zcbl.client.zcblsdk.buldermodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 客户端代码，客户不需要知道具体的建造过程
 */

public class ClientTest {

    public static void main(String[] args) {

        Director director = new Director();

        Builder b1 = new ConcreteBuildOne();
        Builder b2 = new ConcreteBuildTwo();

        //指挥者用ConcreteBuildOne的方法来创建产品
        director.concreateBuilder(b1);
        b1.getProduct();

        //指挥者用ConcreteBuildTwo的方法来创建产品
        director.concreateBuilder(b2);
        b2.getProduct();
    }

}
