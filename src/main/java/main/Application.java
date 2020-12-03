package main;

import main.reflection.Book;
import main.reflection.ReflectionExample;

import java.util.Arrays;

public class Application {

    static ReflectionExample reflectionExample = new ReflectionExample();

    public static void main(String[] args) {
        System.out.println("get Annotation");
        reflectionExample.getAnnotation();

        System.out.println("get DeclaredAnnotation");
        reflectionExample.getDeclaredAnnotation();
    }
}
