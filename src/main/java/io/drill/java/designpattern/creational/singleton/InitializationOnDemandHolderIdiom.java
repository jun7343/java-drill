package io.drill.java.designpattern.creational.singleton;

public class InitializationOnDemandHolderIdiom {

    private InitializationOnDemandHolderIdiom() {}

    private static class SingletonHolder {
        public static final InitializationOnDemandHolderIdiom initializationOnDemandHolderIdiom = new InitializationOnDemandHolderIdiom();
    }

    /*
        pros - JVM Class Loader 매커니즘과 Class Load 되는 시점을 이용한 방법으로써 Lazy Initialization 할 수 있으며, Thread-Safe 하다.
        cons - ?
     */
    public static InitializationOnDemandHolderIdiom getInstance() {
        return SingletonHolder.initializationOnDemandHolderIdiom;
    }
}
