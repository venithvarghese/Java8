package com.java8.interfaces.defaults;

public interface InterfaceB {
	
	default void printSomething() {
        System.out.println("I am inside B interface");
    }

}
