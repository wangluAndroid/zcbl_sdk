package com.zcbl.client.zcblsdk;

/**
 * Created by serenitynanian on 2018/1/20.
 */

public class Hello {

    static {
        System.loadLibrary("hello");
    }

    /**
     * 由于当前版本的as暂时不支持c文件的连接和根据提示自动创建c方法，只有手动添加
     * 添加规则如下：
     * 来到terminal终端上，在app/java/目录下 输入 javah -d ../jni com.zcbl.client.zcblsdk.Hello 按下Enter
     * 那么会在java的上级目录也就是main目录下创建一个jni的文件夹，在文件夹下生成一个com_zcbl_client_zcblsdk_Hello.h
     * 的头文件；或者手动创建；
     * 上面的com.zcbl.client.zcblsdk.Hello是native类中的全路径
     * @return
     */
    public static native String sayHello();
}
