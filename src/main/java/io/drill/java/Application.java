package io.drill.java;

import io.drill.java.reflection.ReflectionExample;

public class Application {

    static ReflectionExample reflectionExample = new ReflectionExample();

    public static void main(String[] args) {
        System.out.println("get Annotation");
        reflectionExample.getAnnotation();

        System.out.println("get DeclaredAnnotation");
        reflectionExample.getDeclaredAnnotation();
    }
}
