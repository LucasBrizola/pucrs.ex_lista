package com.pucrs.ex_email.ex4;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Path coordinates = Paths.get("coordinates.txt");
		String text = null;

		try {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(coordinates);
			text = scanner.useDelimiter("\\A").next();
		} catch (IOException e) {
			System.err.println("could not read file");
			e.printStackTrace();
		}
		System.out.println(text);
		
	}

}
