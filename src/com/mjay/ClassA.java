package com.mjay;

public class ClassA {
void meth() {
	System.out.println("Currently i am learning how to commit this code on git hub");
}
int add(int a,int b) {
	System.out.println("this is your add: "+(a+b));
	return a+b;
}
public static void main(String[] args) {
	ClassA C1=new ClassA();
	C1.add(10, 90);
	C1.meth();
}
}
