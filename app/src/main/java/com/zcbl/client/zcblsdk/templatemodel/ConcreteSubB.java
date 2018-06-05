package com.zcbl.client.zcblsdk.templatemodel;

/**
 * Created by serenitynanian on 2018/6/5.
 * 实现模板抽象类中的抽象方法，每一个AbstractTemplate都可以有任意多个ConcreteSub类，
 *      而每个ConcreteSub都可以实现不同的业务逻辑
 */

public class ConcreteSubB extends AbstractTemplate {
    @Override
    public void primitiveOperateOne() {
        System.out.println("实现类中primitiveOperateOne方法的逻辑执行");
    }

    @Override
    public void primitiveOperateTwo() {
        System.out.println("实现类中primitiveOperateTwo方法的逻辑执行");

    }
}
