package com.java8.interfaces.defaults;

public class ClassC implements InterfaceA, InterfaceB {

//	@Override
//	public void printSomething() {
//		// TODO Auto-generated method stub
//		InterfaceA.super.printSomething();
//	}
	
	@Override
    public void printSomething() {

        //Option 1 -> Provide our own implementation.
        System.out.println("I am inside Main class");

        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
//        InterfaceA.super.printSomething();
//        InterfaceB.super.printSomething();
    }

}
