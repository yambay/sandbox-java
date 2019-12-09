package dev.yambay;

public class K {

	private final int someValue;

	public K(int value) {
		this.someValue = value;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

}
