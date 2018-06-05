package com.zcbl.client.zcblsdk.factroymodel.simple;

/**
 * Created by serenitynanian on 2018/2/9.
 * 具体的除法实现类
 */

public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if (numB == 0) {
//            throw new Exception("除数不能是零");
            System.out.println("除数不能为零");
            return 0.0;
        }
        double result = numA/numB;
        return result;
    }
}
