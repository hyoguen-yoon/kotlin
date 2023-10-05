package com.fastcampus.kotlinjava.jvmstatic;

public class JvmFieldExample {

    public static void main(String[] args) {
        int id2 = JvmFieldClass.Companion.getAaa();
        int id = JvmFieldClass.id;

        String name = JvmFieldObject.name;
        String name2 = JvmFieldObject.INSTANCE.getName2();

        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;
    }
}
