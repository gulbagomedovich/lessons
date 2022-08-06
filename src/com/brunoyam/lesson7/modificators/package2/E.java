package com.brunoyam.lesson7.modificators.package2;

import com.brunoyam.lesson7.modificators.package1.A;

public class E extends A {
    public void test() {
        System.out.println(publicVariable);
        publicMethod();

//        System.out.println(privateVariable);
//        privateMethod();

//        System.out.println(defaultVariable);
//        defaultMethod();

        System.out.println(protectedVariable);
        protectedMethod();
    }
}
