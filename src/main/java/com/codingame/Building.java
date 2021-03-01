package com.codingame;

public class Building {
	private int width;
	private int height;

	public Building(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Building [width=" + width + ", height=" + height + "]";
	}

}
