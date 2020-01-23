package me.dane.OOPExamples;

public class InheritanceSubclassExample extends InheritanceSuperclassExample {

	public InheritanceSubclassExample() {
		this.test();
		number = 13;
	}
	
	public void test2() {
		System.out.println("howya doin");
	}

	@Override
	public void test3() {
		System.out.println("This is an example of abstraction");
	}
	
	public void runtime() {
		System.out.println("Subclass method");
	}
	
}
