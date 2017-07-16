package com.labx;

public class DemoCpp {
    static {
        System.loadLibrary("DemoCpp");
    }

    public native void sayHello();

    public static void main(String[] args) {
        new DemoCpp().sayHello();
    }
}
