package com.labx;

public class Main {
    static {
        System.loadLibrary("Demo");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.cSum(1, 1));

        int[] array = new int[] {10, 2, 1, 5, 9};

        demo.cInsertionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
