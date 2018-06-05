package com.zcbl.client.zcblsdk.factroymodel;

import com.zcbl.client.zcblsdk.factroymodel.simple.Operation;
import com.zcbl.client.zcblsdk.factroymodel.simple.OperationSub;

/**
 * Created by serenitynanian on 2018/2/9.
 */

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
