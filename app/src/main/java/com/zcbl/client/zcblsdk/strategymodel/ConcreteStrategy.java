package com.zcbl.client.zcblsdk.strategymodel;

/**
 * Created by serenitynanian on 2018/2/2.
 * 具体的策略类
 */

public class ConcreteStrategy {

    private Strategy strategy ;

    public ConcreteStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void getConcreteInterface(){
        strategy.algorithmInterface();
    }


    public static void main(String[] args) {

        /**
         * 对于客户端来说 ，只需要知道ConcreteStrategy即可，不需要知道Strategy和ConcreteStrategy;
         * 只需要客户端实例化ConcreteStrategy对象，调用只需要客户端实例化ConcreteStrategy对象的方法，这使得
         * 具体的策略和和客户端彻底分离；
         */
        ConcreteStrategy contextStrategy ;

        contextStrategy = new ConcreteStrategy(new ConcreteStrategyA());
        contextStrategy.getConcreteInterface();

        contextStrategy = new ConcreteStrategy(new ConcreteStrategyB());
        contextStrategy.getConcreteInterface();
    }
}
