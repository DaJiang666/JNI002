#include <jni.h>

#include "com_danjiang_jni_JniClient.h"

JNIEXPORT jstring JNICALL Java_com_danjiang_jni_JniClient_sayName
  (JNIEnv *env, jclass clazz)
{
	env->NewStringUTF( "张丹江 哈哈 !");
}

