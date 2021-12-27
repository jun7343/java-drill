package io.drill.java.designpattern.creational.singleton;

public class ThreadSafeDoubleCheckedLockingLazyInitialization {

    private static volatile ThreadSafeDoubleCheckedLockingLazyInitialization threadSafeDoubleCheckLazyInitialization;

    private ThreadSafeDoubleCheckedLockingLazyInitialization() {}

    /*
        pros - Thread Safe 객체 초기화 가능하며, if double checked 함으로써 getInstance 호출 할 때마다 스레드 lock, unlock에 따른 성능 저하 없음.
        cons - 다소 복잡해(?) 보일 수는 있지만 고려사항 아님.
     */
    public static ThreadSafeDoubleCheckedLockingLazyInitialization getInstance() {
        if (threadSafeDoubleCheckLazyInitialization == null) {
            synchronized (ThreadSafeDoubleCheckedLockingLazyInitialization.class) {
                if (threadSafeDoubleCheckLazyInitialization == null) {
                    threadSafeDoubleCheckLazyInitialization = new ThreadSafeDoubleCheckedLockingLazyInitialization();
                }
            }
        }

        return threadSafeDoubleCheckLazyInitialization;
    }
}
