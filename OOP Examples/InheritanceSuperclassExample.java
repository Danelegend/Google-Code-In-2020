package me.dane.OOPExamples;

public abstract class InheritanceSuperclassExample {

	public int number;
	
	public void test() {
		System.out.println("Accessed from the subclass");
	}
	
	public abstract void test3();
	
	public void runtime() {
		System.out.println("Superclass method");
	}
	
}
