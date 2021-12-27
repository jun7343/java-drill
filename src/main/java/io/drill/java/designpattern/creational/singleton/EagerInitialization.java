package io.drill.java.designpattern.creational.singleton;

public class EagerInitialization {

    private static final EagerInitialization eagerSingleton = new EagerInitialization();

    private EagerInitialization() {}

    /*
        pros - 미리 객체를 초기화하여 Multi-Thread 환경에서 안전하게 사용 가능.
        cons - 동시성 문제는 발생하지 않으나, 만약 해당 객체를 잘 사용하지도 않은데 미리 선언하게 되면 메모리를 점유하기에 비효율적 일수도 있음.
     */
    public static EagerInitialization getInstance() {
        return eagerSingleton;
    }
}
