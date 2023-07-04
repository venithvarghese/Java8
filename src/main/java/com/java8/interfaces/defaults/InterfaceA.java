package com.java8.interfaces.defaults;

 public interface InterfaceA {
	
	default void printSomething() {
        System.out.println("I am inside A interface");
    }

}
