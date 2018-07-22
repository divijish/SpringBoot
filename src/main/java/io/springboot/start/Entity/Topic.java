package io.springboot.start.Entity;

public class Topic {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Topic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Topic() {
		super();
	}
	
	



}
