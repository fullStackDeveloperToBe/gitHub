package com.java.eight.optional;

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.empty();
        System.out.println(opt1);

        String name = "Optional Class of method";
        Optional<String> opt2 = Optional.of(name);
        System.out.println(opt2);

        String name2 = "ofNullable";
        Optional<String> opt3 = Optional.ofNullable(name2);
        System.out.println(opt3);

        String n = null;
        String opt4 = Optional.ofNullable(n).orElse("orElse for else condition");
        String opt5 = opt3.get();
        System.out.println(opt4+" "+opt5);

        Customer customer = new Customer(1, "Arun", "arun@test.com",12000);
        System.out.println(customer.getCustName());
        Optional<String> cust = Optional.ofNullable(customer.getCustEmail());
//        if(cust.isPresent()) {
            System.out.println(cust.orElseThrow(()->new RuntimeException("please give valid emailId")));
        //}
        System.out.println(cust.map(String::toUpperCase).orElseGet(()->"default@email.com"));
        Optional<Customer> custi = Optional.of(customer);


    }
}
