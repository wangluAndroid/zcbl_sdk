package com.zcbl.client.zcblsdk;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        String str = "woca";
        Integer ii = 0 ;
        getCla(ii.getClass());

        //PECS

    }

    public void getCla(Class aClass) {
        String simpleName = aClass.getSimpleName();
        String name = aClass.getName();
//        Log.i("Test", "simpleName: "+simpleName);
        System.out.println("----------->"+simpleName);//String
        System.out.println("-----name---->"+name);//java.lang.String

    }
}