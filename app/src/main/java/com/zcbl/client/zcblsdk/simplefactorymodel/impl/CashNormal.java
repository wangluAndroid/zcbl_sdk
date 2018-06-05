package com.zcbl.client.zcblsdk.simplefactorymodel.impl;

import com.zcbl.client.zcblsdk.simplefactorymodel.CashSuper;

/**
 * Created by serenitynanian on 2018/2/2.
 * 正常收费
 */

public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
