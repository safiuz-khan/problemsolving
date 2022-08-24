package com.practise;

interface A{
      void show();
}
public class LambdaDemo implements A{
    public static void main(String[] args) {
        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.show();
        A obj = () ->  System.out.println("Hello from new Impl");
        obj.show();
    }

    @Override
    public void show() {
        System.out.println("Hello from IMPL");
    }
}
