package com.zcbl.client.zcblsdk.buldermodel;

import com.zcbl.client.zcblsdk.buldermodel.Builder;

/**
 * Created by serenitynanian on 2018/6/5.
 *
 * 具体的建造类
 */

public class ConcreteBuildOne extends  Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
