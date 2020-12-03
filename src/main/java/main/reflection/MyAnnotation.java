package main.reflection;

import java.lang.annotation.*;

// 어노테이션 실행 범위 또는 미치는 시점 영향
@Retention(RetentionPolicy.RUNTIME)
// 어노테이션 적용할 위치
@Target({ElementType.TYPE, ElementType.FIELD})
// 어노테이션 상속
@Inherited
public @interface MyAnnotation {

    String value() default "JunYu";

    int number() default 500;
}
