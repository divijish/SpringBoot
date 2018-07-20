package io.springboot.start.Entity;

public class Topic {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topic [name=" + name + "]";
	}

	public Topic(String name) {
		super();
		this.name = name;
	}

	public Topic() {
		super();
	}
	
	



}
