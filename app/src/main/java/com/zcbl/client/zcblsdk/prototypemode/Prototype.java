package com.zcbl.client.zcblsdk.prototypemode;

/**
 * Created by serenitynanian on 2018/2/11.
 * 原型抽象类
 * 在java中要实现克隆操作，继承Cloneable,重写clone
 */

public abstract class Prototype implements Cloneable{
    private String id ;
    protected String type ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 创建当前对象的浅表副本。
     * 该方法是创建一个新对象，然后将当前对象的非静态字段复制到该对象。
     *          如果该字段是值类型，则对该字段执行逐位复制--也就是直接拷贝一份。
     *          如果该字段是引用类型，则复制引用但不复制引用的对象（C语言中也就是复制指针的地址，还是指向同一内存区域）；因此，原始对象及其副本引用同一对象
     * @return
     */
    public Object clone(){
        Object obj = null ;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 深拷贝
     * @param concretePrototype1
     * @return
     */
    public Object deepClone(ConcretePrototype1 concretePrototype1){
        ConcretePrototype1 copy = new ConcretePrototype1();
        copy.type = concretePrototype1.type;
        return copy ;
    }

    abstract void say();

}
