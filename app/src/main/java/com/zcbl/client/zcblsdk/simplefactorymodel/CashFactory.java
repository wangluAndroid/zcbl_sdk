package com.zcbl.client.zcblsdk.simplefactorymodel;

import com.zcbl.client.zcblsdk.simplefactorymodel.impl.CashNormal;
import com.zcbl.client.zcblsdk.simplefactorymodel.impl.CashRebate;
import com.zcbl.client.zcblsdk.simplefactorymodel.impl.CashReturn;

/**
 * Created by serenitynanian on 2018/2/2.
 * 简单工厂模式：这个模式只是用来解决创建对象的问题；
 * 现金收费工厂类
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type){
        CashSuper cs = null ;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break ;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break ;
            case "打八折":
                cs = new CashRebate(0.8);
                break ;

        }
        return cs ;
    }

    public static void main(String[] args) {
        CashSuper cs = CashFactory.createCashAccept("打八折");
        double result = cs.acceptCash(100);
        System.out.println("----result----->"+result);
    }

}
