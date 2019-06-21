package com.pucrs.ex_email.ex4;

public class Plateau {
	private int BottomX = 0;
	private int LeftY = 0;
	private int MaxX;
	private int MaxY;

	public int getBottomX() {
		return BottomX;
	}

	public int getLeftY() {
		return LeftY;
	}

	public int getMaxX() {
		return MaxX;
	}

	public int getMaxY() {
		return MaxY;
	}

	public void getBorders(char X, char Y) {
		this.MaxX = Integer.parseInt(String.valueOf(X));
		this.MaxY = Integer.parseInt(String.valueOf(Y));

	}
	
	public String getCoordinates() {
		
		String x = String.valueOf(getMaxX());
		String y = String.valueOf(getMaxY());;
		String xy = x+" "+y;
		return xy;
	}
}
