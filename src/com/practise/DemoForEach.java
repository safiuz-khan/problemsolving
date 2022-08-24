package com.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>{
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}

public class DemoForEach {
    public static void main(String[] args) {
        List values = Arrays.asList(1,3,6,24,53,23);

        //Consumer<Integer> c =  integer ->  System.out.println(integer);

        //values.forEach( i -> System.out.println(i));
        values.forEach(integer ->  System.out.println(integer));

    }
}
