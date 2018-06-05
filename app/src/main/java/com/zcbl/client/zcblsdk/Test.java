package com.zcbl.client.zcblsdk;


import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serenitynanian on 2018/3/14.
 */

public class Test {

//    private List<?>  list ;

    public List<?> getList() {

        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    public <T> void test(T t) {

    }

    public static void test1(List<Object> list) {

    }

    public static void main(String[] args){

//        List<? super Number> list = null ;

//        test(list);

//        List<Number> numList = new ArrayList<Number>();
//        List<Integer> intList = new ArrayList<Integer>();
//        numList.addAll(intList);

//        List<Number> numList = new ArrayList<Number>();
//        List<Integer> intList = new ArrayList<Integer>();
//
//        String str = "";
//        Class<? extends String> aClass = str.getClass();
//        String simpleName = aClass.getSimpleName();
//        String name = aClass.getName();
//        Log.i("Test", "main: "+name);
//        Log.i("Test", "simpleName: "+simpleName);


//        List<Object> list = new ArrayList<Object>();
        List<String> strList = new ArrayList<>();
//        list.addAll(strList);

//        test1(strList);

//        Number[] num = new Number[5];
        Integer[] ii = new Integer[5];
        Number[] num = ii ;
//        num[0] = 0.5 ;
        List<Integer> lis = new ArrayList<>();
        List<? super Integer>  nn = lis;
        nn.add(1);
    }

    //? 在写方法签名中定义形参的类型
    //泛型方法中的类型形参必须在对应的方法中显式声明
    public static <T,S> void copy(List<T> dest, List<?> src) {

    }
    //通配符用于定义变量的类型
    private List<?> list ;//代表它是各种泛型List的父类


}
