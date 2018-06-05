package com.zcbl.client.zcblsdk.decoratormodel;

/**
 * Created by serenitynanian on 2018/2/8.
 * ConcreteComponent 是定义了一个具体的对象，也可以给这个对象添加一些职责
 */

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("-----ConcreteComponent-------具体对象的操作");
    }
}
