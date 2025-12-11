package org.example.ex_02_RestAssuredConcepts;

public class API2_BuilderPattern {
    public API2_BuilderPattern Step1() {
        System.out.println("Step1");
        return this;
    }
    public API2_BuilderPattern Step2(){
        System.out.println("Step2");
        return this;
    }
    public API2_BuilderPattern Step3(){
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        API2_BuilderPattern bp = new API2_BuilderPattern();
        bp.Step1().Step2().Step3();

    }
}

//Builder pattern is used in rest assured to run the classes together
