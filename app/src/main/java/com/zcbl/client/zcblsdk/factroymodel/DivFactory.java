package com.zcbl.client.zcblsdk.factroymodel;

import com.zcbl.client.zcblsdk.factroymodel.simple.Operation;
import com.zcbl.client.zcblsdk.factroymodel.simple.OperationDiv;

/**
 * Created by serenitynanian on 2018/2/9.
 */

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
