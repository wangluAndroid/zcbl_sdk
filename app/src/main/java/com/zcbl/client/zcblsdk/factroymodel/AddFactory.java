package com.zcbl.client.zcblsdk.factroymodel;

import com.zcbl.client.zcblsdk.factroymodel.simple.Operation;
import com.zcbl.client.zcblsdk.factroymodel.simple.OperationAdd;

/**
 * Created by serenitynanian on 2018/2/9.
 */

public class AddFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
