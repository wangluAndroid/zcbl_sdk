package com.zcbl.client.zcblsdk.simplefactorymodel.impl;

import com.zcbl.client.zcblsdk.simplefactorymodel.CashSuper;

/**
 * Created by serenitynanian on 2018/2/2.
 * 返利收费子类
 */

public class CashReturn extends CashSuper {
    private double moneyCondition ;
    private double moneyReturn ;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money ;
        if (money > moneyCondition) {
            result = money - (money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
