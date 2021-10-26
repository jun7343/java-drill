# Design Pattern - Singleton

## :book: Description

싱글톤 패턴을 사용함으로써 얻을 수 있는 대표적인 이점 세가지.
- 메모리 절약
- 데이터 공유
- 단일 인스턴스 보장

싱글톤 패턴을 사용함으로써 무분별한 객체 생성을 방지하고 static 변수를 통해 고정된 메모리를 사용함으로써 메모리 절약과 
데이터 공유를 할 수 있다. (다만 데이터 수정시 동시성 문제 발생 가능성 있음.) 

싱글톤 패턴 생성 방법 5가지
- [Eager Initialization](EagerInitialization.java)
- [Lazy Initialization](LazyInitialization.java)
- [Thread Safe Lazy Initialization](ThreadSafeLazyInitialization.java)
- [Thread Safe Double Check Locking Initialization](ThreadSafeDoubleCheckedLockingLazyInitialization.java)
- [Initialization On Demand Holder Idiom](InitializationOnDemandHolderIdiom.java)