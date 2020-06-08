package com.sjtu.lesson07;

/**
 * @author linfengde
 * @date 2020/3/15 17:51
 */
public class TestInterface implements C {
    public void testa() {

    }

    public void testb() {

    }

    public void testc() {

    }
}

interface A {
    void testa();
}
interface B {
    void testb();
}
/**接口可以多继承：接口C继承接口A和B*/
interface C extends A, B {
    void testc();
}

