/*
 * @ author Bhubanananda
 */
package com.bhubanananda.encapsulation;

/**
 * The Class Main.
 *
 * @author Bhubanananda
 */
public class Main {

	/**
	 * Display.
	 */
	void display() {
		User user = new User(1L, "Bhuban", 101, "bkhadi0203@gmai.com");
		System.out.println(user);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new Main().display();

	}

}
