package com.pucrs.ex_email.ex4;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rover rover1 = new Rover();
		Rover rover2 = new Rover();
		Plateau mars = new Plateau();
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
		String lines[] = text.split("\\r?\\n");

		char[] textAsChar = lines[0].toCharArray();
		mars.getBorders(textAsChar[0], textAsChar[2]);
		System.out.println(mars.getCoordinates() + " coordenadas");
		textAsChar = lines[1].toCharArray();
		rover1.setActualCoordinates(textAsChar[0], textAsChar[2], textAsChar[4]);
		System.out.println(lines[1]);
	}

}
