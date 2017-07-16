package com.labx;

public class Demo {

    public int sum(int a, int b) {
        return a + b;
    }

    public native int cSum(int a, int b);

    public void insertionSort(int[] array) {
        if (null == array || array.length <= 1) {
            return;
        }

        int len = array.length;
        for (int i = 1; i < len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[j + 1]) {
                    int t = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = t;
                }
            }
        }
    }

    public native void cInsertionSort(int[] array);
}
