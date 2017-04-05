package com.wolfsystems;

public class Main {

	public static void main(String[] args) {
		String txt = "Hello World";
		
		if (args.length > 0)
			txt += ", and hello to you, " + args[0];
		System.out.println(txt + ".");
	}
	
}