package io.drill.java.design_pattern.creational.builder;

/*
    보통의 Builder Pattern 생성 방법.
 */
public class ExampleDomain {
    private final Integer integerA;
    private final Integer integerB;
    private final String stringC;
    private final String stringD;
    private final Integer integerE;
    private final Double doubleF;

    public ExampleDomain(Integer integerA, Integer integerB, String stringC, String stringD, Integer integerE, Double doubleF) {
        this.integerA = integerA;
        this.integerB = integerB;
        this.stringC = stringC;
        this.stringD = stringD;
        this.integerE = integerE;
        this.doubleF = doubleF;
    }

    /*
        Method Chaining을 위해 builder method를 생성하여 Builder 객체를 리턴한다.
     */
    public static ExampleDomainBuilder builder() {
        return new ExampleDomainBuilder();
    }

    public static class ExampleDomainBuilder {
        private Integer integerA;
        private Integer integerB;
        private String stringC;
        private String stringD;
        private Integer integerE;
        private Double doubleF;

        public ExampleDomainBuilder integerA(Integer integerA) {
            this.integerA = integerA;
            return this;
        }

        public ExampleDomainBuilder integerB(Integer integerB) {
            this.integerB = integerB;
            return this;
        }

        public ExampleDomainBuilder stringC(String stringC) {
            this.stringC = stringC;
            return this;
        }

        public ExampleDomainBuilder stringD(String stringD) {
            this.stringD = stringD;
            return this;
        }

        public ExampleDomainBuilder integerE(Integer integerE) {
            this.integerE = integerE;
            return this;
        }

        public ExampleDomainBuilder doubleF(Double doubleF) {
            this.doubleF = doubleF;
            return this;
        }

        public ExampleDomain build() {
            return new ExampleDomain(integerA, integerB, stringC, stringD, integerE, doubleF);
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
