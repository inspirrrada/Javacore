package main.java.com.oksana.javacore.chapter07;

public class Test {
    int a, b;

    Test() { }

    Test(int i) {
        a = i;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    //возвратить логическое значение true, если в качестве параметра o указан вызывающий объект
    boolean equals(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }

    // Аргументы примитивных типов передаются по значению
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    //передать объект
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
