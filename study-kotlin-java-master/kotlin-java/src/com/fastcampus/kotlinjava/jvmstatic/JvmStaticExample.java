package com.fastcampus.kotlinjava.jvmstatic;

public class JvmStaticExample {

    public static void main(String[] args) {

        String hello2 = HelloClass.Companion.hello();
        String hello = HelloClass.hello();
        System.out.println(hello);

        String hi2 = HiObject.INSTANCE.hi();
        String hi = HiObject.hi();
        System.out.println(hi);

    }
}
