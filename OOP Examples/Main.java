package me.dane.OOPExamples;

public class Main {

	public static void main(String[] args) {
	InheritanceSubclassExample polymorphismExample = new InheritanceSubclassExample();
	polymorphismExample.test2();
	polymorphismExample.test3();
	
	//Calls the method from InheritanceSubclassExample
	polymorphismExample.runtime();
	
	InheritanceSuperclassExample polymorphismExample2 = polymorphismExample;
	polymorphismExample2.test();
	
	//Calls the method from InheritanceSubclassExample over method from InheritanceSuperclassExample.
	polymorphismExample2.runtime();
	
	Parent p = new Parent();
	p.runtime();
	
	Child c = new Child();
	c.runtime();
	
	
	Parent p1 = c;
	c.runtime();
	
	CompileTimeExample compile1 = new CompileTimeExample("hi", 1);
	CompileTimeExample compile2 = new CompileTimeExample(2.0, 13);
	
	compile1.compileTest(16, "test");
	compile1.compileTest(true, 13.1313);
	
	}

}
