package com.zcbl.client.zcblsdk.buldermodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serenitynanian on 2018/6/5.
 * 产品类，由多个部件组成
 */

public class Product {

    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("-----产品---部件---->"+parts.get(i));
        }
    }


}
