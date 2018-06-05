package com.zcbl.client.zcblsdk.buldermodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 抽象建造者类，确定产品由两个部件PartA和PratB组成，并声明一个得到产品建造结果的方法getProduct()
 */

public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getProduct();
}
