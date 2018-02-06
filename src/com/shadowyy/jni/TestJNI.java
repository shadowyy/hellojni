package com.shadowyy.jni;

public class TestJNI{
    public static native void hello(int frequency, int duration);

    public static void main(String[] args) {
        System.loadLibrary("hello");
        hello(2000,2000);
    }
}