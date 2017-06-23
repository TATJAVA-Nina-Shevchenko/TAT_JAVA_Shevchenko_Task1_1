package com.epam.shevchenko.beans;

public class FourDigitalNumber {

	private int number;

	public FourDigitalNumber(int number) {
		this.number = number;
	}

	public FourDigitalNumber() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FourDigitalNumber other = (FourDigitalNumber) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FourDigitalNumber [number=" + number + "]";
	}

	
}