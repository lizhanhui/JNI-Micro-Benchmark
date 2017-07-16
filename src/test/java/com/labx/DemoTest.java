package com.labx;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void insertionSort() throws Exception {
        int[] array = {100, 30, 5};
        new Demo().insertionSort(array);
        for (int d : array) {
            System.out.println(d);
        }
    }

}