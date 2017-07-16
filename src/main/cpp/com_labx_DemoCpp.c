#include <jni.h>
#include "com_labx_DemoCpp.h"
#include "DemoCppImpl.h"

JNIEXPORT void JNICALL Java_com_labx_DemoCpp_sayHello(JNIEnv *env, jobject obj) {
  sayHello();
  return;
}