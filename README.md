# JNI

####cmd

javac src\com\shadowyy\jni\TestJNI.java -d out\

javah -jni  -classpath ./out -o ./jni/TestJNI.h  com.shadowyy.jni.TestJNI

java -Djava.library.path=D:\code\java\hellojni\dll\ -classpath ./out  com.shadowyy.jni.TestJNI


