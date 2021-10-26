package io.drill.java.reflection;

@MyAnnotation
public class Book {

    private String A = "A";
    private static String B = "B";
    private static final String C = "C";
    public String D = "D";
    public static String E = "E";
    public static final String F = "F";

    public Book() {
    }

    public Book(String a, String d) {
        A = a;
        D = d;
    }

    public void G() {
        System.out.println("G");
    }

    public int H() {
        return 100;
    }
}
