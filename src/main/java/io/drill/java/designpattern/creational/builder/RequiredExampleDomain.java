package io.drill.java.designpattern.creational.builder;

/*
    반드시 기입되야 하는 값이 존재할 경우 생성 방법.
 */
public class RequiredExampleDomain {
    private final Integer integerA;
    private final Integer integerB;
    private final String stringC;
    private final String stringD;
    private final Integer integerE;
    private final Double doubleF;

    public RequiredExampleDomain(Integer integerA, Integer integerB, String stringC, String stringD, Integer integerE, Double doubleF) {
        this.integerA = integerA;
        this.integerB = integerB;
        this.stringC = stringC;
        this.stringD = stringD;
        this.integerE = integerE;
        this.doubleF = doubleF;
    }

    /*
        반드시 기입 되야하는 변수를 builder method에 Parameter로 받아 Builder 객체 생성.
        기입되야 하는 변수가 많으면 Builder Pattern을 사용하는 의마가 없기에, 만약 기입되야 하는 변수가 많으면 Builder Class에 Default 값을 기입하여 보완.
        ex:) private Integer integerA = 1;
     */
    public static ExampleDomainBuilder builder(Integer integerA, String stringD, Integer integerE) {
        return new ExampleDomainBuilder(integerA, stringD, integerE);
    }

    public static class ExampleDomainBuilder {
        private final Integer integerA;
        private Integer integerB;
        private String stringC;
        private final String stringD;
        private final Integer integerE;
        private Double doubleF;

        public ExampleDomainBuilder(Integer integerA, String stringD, Integer integerE) {
            this.integerA = integerA;
            this.stringD = stringD;
            this.integerE = integerE;
        }

        public ExampleDomainBuilder integerB(Integer integerB) {
            this.integerB = integerB;
            return this;
        }

        public ExampleDomainBuilder stringC(String stringC) {
            this.stringC = stringC;
            return this;
        }

        public ExampleDomainBuilder doubleF(Double doubleF) {
            this.doubleF = doubleF;
            return this;
        }

        public RequiredExampleDomain build() {
            return new RequiredExampleDomain(integerA, integerB, stringC, stringD, integerE, doubleF);
        }
    }

    public Integer getIntegerA() {
        return integerA;
    }

    public Integer getIntegerB() {
        return integerB;
    }

    public String getStringC() {
        return stringC;
    }

    public String getStringD() {
        return stringD;
    }

    public Integer getIntegerE() {
        return integerE;
    }

    public Double getDoubleF() {
        return doubleF;
    }
}
