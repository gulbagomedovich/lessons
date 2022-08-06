package com.brunoyam.lesson7.modificators.package2;

import com.brunoyam.lesson7.modificators.package1.A;

public class D {
    public void test() {
        A a = new A();

        System.out.println(a.publicVariable);
        a.publicMethod();

//        System.out.println(a.privateVariable);
//        a.privateMethod();

//        System.out.println(a.defaultVariable);
//        a.defaultMethod();

//        System.out.println(a.protectedVariable);
//        a.protectedMethod();
    }
}
