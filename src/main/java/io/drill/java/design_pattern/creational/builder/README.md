# Design Pattern - Builder

## :book: Description

빌더 패턴을 사용함으로써 얻는 이점
- 객체 생성자의 Parameter가 많아질수록 복잡한 객체 생성을 builder method chaining으로 유연하게 객체 생성 가능.


```java
public ExampleDomain(int a, int b, String c, String d, int e, int f, String g, String h) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
    this.g = g;
    this.h = h;
}
```

ExampleObject 객체를 생성할 때 위와 같은 argument 값을 일일이 넣어줘야 한다. 만약 이 보다 많은 argument 수와 훨씬 더 긴 변수명일 경우
해당 Class에 들어가 생성자 Parameter 순서를 확인해 보는 불상사가 발생할 수 있다.

```java

ExampleDomain exampleDomain = new ExampleDomain(1, 2, "3", null, 4, 5, null, "7");
```

위와 같이 argument를 일일이 순서에 맞게 기입해야 하며, argument 값이 null 일 경우에도 argument 순서를 위해 기입해 줘야하는 번거로움이 있다.
이러한 번거로움을 Builder Pattern을 통해 극복할 수 있다.

개인적인 생각으로 한번 생성된 객체는 Data가 변경되면 안된다는 생각이 있기에 Data값을 수정할 수 있는 Setter를 기피하며 생성자를 통해 Data를 한번 주입하는 것을 
선호한다. 그래서 객체 생성시 유연한 객체 생성을 위해 Builder Pattern을 선호한다.

빌더 패턴 생성 방법
- [ExampleDomain](ExampleDomain.java)
- [RequiredExampleDomain](RequiredExampleDomain.java)

