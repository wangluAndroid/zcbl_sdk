//
// Created by Serenity那年 on 2018/1/20.
//

#include "com_zcbl_client_zcblsdk_Hello.h"


JNIEXPORT jstring JNICALL Java_com_zcbl_client_zcblsdk_Hello_sayHello
  (JNIEnv * env, jclass jclass1){

    return env->NewStringUTF(" from native c");
  }