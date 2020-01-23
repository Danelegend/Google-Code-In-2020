package me.dane.OOPExamples;

public class EncapsulationExample {

	private int number;
	private double dubNum;
	private String name;
	private double finalNum;
	
	public EncapsulationExample(int num, double dubNum, String name) {
		this.number = num;
		this.dubNum = dubNum;
		this.name = name;
		this.addNumbers();
	}
	
	private void addNumbers() {
		finalNum = number + dubNum;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
	public void setDubNumber(double dubNum) {
		this.dubNum = dubNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getDubNumber() {
		return dubNum;
	}
	
	public String getName() {
		return name;
	}
	
	public double getFinalNumber() {
		return finalNum;
	}
	
}
