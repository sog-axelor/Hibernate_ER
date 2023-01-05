package com.unique.demo.Module;

import com.google.inject.AbstractModule;
import com.unique.demo.Service.Calculator;
import com.unique.demo.Service.CalculatorImpl;


public class CalculatoreModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(Calculator.class).to(CalculatorImpl.class);
	}
}