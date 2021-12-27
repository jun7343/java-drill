package io.drill.java.designpattern.creational.singleton;

public class LazyInitialization {

    private static LazyInitialization lazyInitialization;

    private LazyInitialization() {}

    /*
        pros - getInstance 첫 호출 될 때 객체 초기화 되어 객체 반환.
        cons - Multi-Thread 환경에서 동시성 문제 발생할 수 있음.
     */
    public static LazyInitialization getInstance() {
        if (lazyInitialization == null) {
            lazyInitialization = new LazyInitialization();
        }

        return lazyInitialization;
    }
}
