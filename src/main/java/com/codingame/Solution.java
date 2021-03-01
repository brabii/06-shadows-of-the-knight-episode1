package com.codingame;

public class Solution {
	static String solution(String direction, int x, int x1, int x2, int y, int y1, int y2) {
		if (direction.contains("U")) {
			y2 = y - 1;
		} else if (direction.contains("D")) {
			y1 = y + 1;
		}

		if (direction.contains("L")) {
			x2 = x - 1;
		} else if (direction.contains("R")) {
			x1 = x + 1;
		}

		x = x1 + (x2 - x1) / 2;
		y = y1 + (y2 - y1) / 2;

		return x + " " + y;
	}

	static String getBatmanPosition(DirectionEnum direction, int x, int y, int numTurns, int pos1, int pos2) {
		switch (direction) {
		case U:
			pos1 = pos1 / 2;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		case UR:
			pos1 = pos1 / 2;
			pos2 = ((pos2 + y) / 2) - 1;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		case R:
			pos2 = ((pos2 + y) / 2) - 1;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		case DR:
			pos1 = ((pos1 + x) / 2) - 1;
			pos2 = ((pos2 + y) / 2) - 1;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		case D:
			pos1 = ((pos1 + x) / 2) - 1;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		case DL:
			pos1 = ((pos1 + x) / 2) - 1;
			pos1 = pos1 / 2;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		case UL:
			pos2 = pos2 / 2;
			pos1 = pos1 / 2;
			System.out.println("position batman	 : (" + pos1 + " , " + pos2 + ")");
			break;
		case L:
			pos2 = pos2 / 2;
			System.out.println("position batman : (" + pos1 + " , " + pos2 + ")");
			break;
		}

		return pos1 + " " + pos2;
	}
}
