package com.zcbl.client.zcblsdk.simplefactorymodel.impl;

import com.zcbl.client.zcblsdk.simplefactorymodel.CashSuper;

/**
 * Created by serenitynanian on 2018/2/2.
 * 现金折扣
 */

public class CashRebate extends CashSuper {
    private double moneyRebate ;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*this.moneyRebate;
    }
}
