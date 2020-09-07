package com.misc;

public class NameValue implements Comparable<NameValue>{
	
	private String name;
	
	public NameValue() {}
	
	public NameValue(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(NameValue o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "NameValue [name=" + name + "]";
	}
	
}
