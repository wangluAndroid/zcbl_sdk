package com.zcbl.client.zcblsdk.decoratormodel;

/**
 * Created by serenitynanian on 2018/2/8.
 * Decorate 装饰抽象类，继承了Component,从外类来扩展Component类的功能，但对于Component来说，是无需知道Decorate的存在
 */

public abstract class Decorate extends Component {
    private Component component;

    /**
     * 设置component
     * @param component
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * 重写operate(),实际执行的是Component的operate()
     */
    @Override
    public void operate() {
        if (component != null) {
            component.operate();
        }
    }
}
