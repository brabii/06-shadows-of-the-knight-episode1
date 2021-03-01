package com.codingame;

public enum DirectionEnum {
	U("up"), UR("up right"), UL("up left"), D("down"), DR("down right"), DL("down left"), R("right"), L("left");

	private String value;

	private DirectionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
