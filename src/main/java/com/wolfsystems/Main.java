package com.wolfsystems;

import com.wolfsystems.utils.Utils;

public class Main {

	public static void main(String[] args) {
		Utils.setError(true);
		Utils.print("Begining program...");
		
		Utils.setError(false);
		String txt = "Hello World";
		
		if (args.length > 0)
			txt += ", and hello to you, " + args[0];
		Utils.print(txt + ".");
	}
	
}