package com.revature.fsd.examples.exception;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void exceptionScenario1() { // exception when executing statement
		int number = 100 / 0;
		System.out.println(number);
	}
	
	public static void exceptionScenario2() { // exception thrown by method - unchecked
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = scanner.nextInt();
		System.out.println(age);
	}

	public static void main(String[] args) {
		exceptionScenario2();
	}

}
