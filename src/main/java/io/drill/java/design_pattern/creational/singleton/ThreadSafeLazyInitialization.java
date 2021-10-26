package io.drill.java.design_pattern.creational.singleton;

public class ThreadSafeLazyInitialization {

    private static ThreadSafeLazyInitialization threadSafeLazyInitialization;

    private ThreadSafeLazyInitialization() {}

    /*
        pros - 객체를 Thread-Safe 하게 초기화.
        cons - getInstance를 호출 할때마다 스레드 lock, unlock을 처리하기에 내부적으로 많은 비용이 발생하여 성능저하가 따름.
     */
    public static synchronized ThreadSafeLazyInitialization getInstance() {
        if (threadSafeLazyInitialization == null) {
            threadSafeLazyInitialization = new ThreadSafeLazyInitialization();
        }

        return threadSafeLazyInitialization;
    }
}
