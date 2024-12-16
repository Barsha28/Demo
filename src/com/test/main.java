package com.test;

public class main {
public static void main(String[] args) {
	Staticcl.printfromabstract();	
	child.printfromabstract();
}
}
class child extends Staticcl{
	static void printfromabstract() {
		System.out.println("hello child");
	}	
}
abstract class Staticcl{
	static void printfromabstract() {
		System.out.println("hello abstract");
	}
}
