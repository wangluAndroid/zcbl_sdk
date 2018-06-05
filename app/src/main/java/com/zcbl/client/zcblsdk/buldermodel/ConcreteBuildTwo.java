package com.zcbl.client.zcblsdk.buldermodel;

/**
 * Created by serenitynanian on 2018/6/5.
 */

public class ConcreteBuildTwo extends  Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
