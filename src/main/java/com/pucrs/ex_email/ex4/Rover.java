package com.pucrs.ex_email.ex4;

public class Rover {
	private int x;
	private int y;
	private char direction;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public char getDirection() {
		return direction;
	}

	public void setActualCoordinates(int x, int y, char direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public void setDirection(char dir) {
		dir = Character.toUpperCase(dir);
		if (dir == 'N' || dir == 'S' || dir == 'E' || dir == 'W') {
			this.direction = dir;
		} else
			System.err.println("not a valid direction to change.");
	}

	public String showCoordinates() {
		String hovDir = x + "" + y + " direction";
		return hovDir;
	}

	public void changeDirection(char rotateSide) {
		rotateSide = Character.toUpperCase(rotateSide);
		if (rotateSide == 'L' || rotateSide == 'R') {
			switch (direction) {
			case 'N':
				if (rotateSide == 'L') {
					setDirection('W');
				} else
					setDirection('E');
				break;
			case 'S':

				if (rotateSide == 'L') {
					setDirection('E');
				} else
					setDirection('W');
				break;

			case 'E':
				if (rotateSide == 'L') {
					setDirection('N');
				} else
					setDirection('S');
				break;

			case 'W':
				if (rotateSide == 'L') {
					setDirection('S');
				} else
					setDirection('N');
				break;

			default:
				System.err.println("direction not exists");
				break;
			}
		}
	}

	public void move() {
		switch (direction) {
		case 'N':
			this.y += 1;
			break;
		case 'W':
			this.x += -1;
			break;
		case 'E':
			this.x += 1;
			break;
		case 'S':
			this.y += -1;
			break;
		}
	}

}
