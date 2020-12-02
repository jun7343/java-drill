package main.reflection;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/*
    Reflection 사용법
 */
public class ReflectionExample {

    // Class Type 선언 1
    Class<MyBook> myBookClass1 = MyBook.class;
    MyBook myBook = new MyBook();
    // Class Type 선언 2
    Class<? extends MyBook> myBookClass2 = myBook.getClass();

    // Class Type 선언 3
    Class<?> myBookClass3;
    {
        try {
            myBookClass3 = Class.forName("main.reflection.MyBook");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    // return only public
    public void getFields() {
        Arrays.stream(myBookClass1.getFields()).forEach(System.out::println);
    }

    public void getField(String fieldName) {
        try {
            System.out.println(myBookClass1.getField(fieldName));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    // return all Fields
    public void getDeclaredFields() {
        Arrays.stream(myBookClass1.getSuperclass().getDeclaredFields()).forEach(System.out::println);
    }

    public void getDeclaredField(String fieldName) {
        try {
            System.out.println(myBookClass1.getDeclaredField(fieldName));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void getInterface() {
        Arrays.stream(myBookClass1.getInterfaces()).forEach(System.out::println);
    }

    public void getSuperClass() {
        System.out.println(myBookClass1.getSuperclass());
    }

    public void getModifiers() {
        Arrays.stream(myBookClass1.getDeclaredFields()).forEach(field -> {
            int modifiers = field.getModifiers();
            System.out.println(field);
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(Modifier.isStatic(modifiers));
        });
    }


}
