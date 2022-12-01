package com.java.methodreference;

public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        System.out.println("Learning Method Refernces");
        Employee emp = DoTask::doTask;
        emp.empName();

    }
}
