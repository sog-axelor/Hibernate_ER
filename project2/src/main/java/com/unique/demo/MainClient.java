package com.unique.demo;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.demo.Module.CalculatoreModule;
import com.unique.demo.Service.Calculator;

public class MainClient{
	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new CalculatoreModule());
		Calculator cl = ij.getInstance(Calculator.class);
		System.out.println("Addtion : "+ cl.add(20, 25) );
		System.out.println("SUbstraction : "+ cl.sub(25, 20) );
		System.out.println("Multiple : "+ cl.mul(20, 25) );
		System.out.println("Division : "+ cl.div(100, 20) );

	}
}