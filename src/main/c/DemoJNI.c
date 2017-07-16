#include <jni.h>
#include <stdio.h>
#include "com_labx_Demo.h"

/*
 * Class:     com_labx_Demo
 * Method:    cSum
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_labx_Demo_cSum
  (JNIEnv *env, jobject obj, jint a, jint b) {
    return a + b;
}


/*
 * Class:     com_labx_Demo
 * Method:    cInsertionSort
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_com_labx_Demo_cInsertionSort (JNIEnv *env, jobject obj, jintArray arr) {
   jint* pArr = (*env)->GetIntArrayElements(env, arr, NULL);
   if (NULL == pArr) {
      return;
   }

   jsize size = (*env)->GetArrayLength(env, arr);
   if(size <= 1) {
      return;
   }

   // Insertion Sort.
   int i = 0;
   int j = 0;
   for(i = 1; i < size; i++) {
      for(j = i - 1; j >= 0; j--) {
         if (*(pArr + j + 1) < *(pArr + j)) {
             jint t = *(pArr + j + 1);
             *(pArr + j + 1) = *(pArr + j);
             *(pArr + j) = t;
         } else {
            break;
         }
      }
   }

   (*env)->SetIntArrayRegion(env, arr, 0, size, pArr);
}