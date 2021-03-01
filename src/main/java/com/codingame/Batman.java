package com.codingame;

public class Batman {
	private int positionX;
	private int positionY;

	public Batman(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "Batman [positionX=" + positionX + ", positionY=" + positionY + "]";
	}
}
