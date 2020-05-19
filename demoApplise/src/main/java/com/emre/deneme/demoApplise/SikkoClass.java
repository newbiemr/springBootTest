package com.emre.deneme.demoApplise;

import org.springframework.stereotype.Component;

@Component
public class SikkoClass {
	
	private int id;
	private String name;
	
	public SikkoClass() {
		super();
		System.out.println("__constructor__");
	}
	
	public void msg() {
		System.out.println("msg");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
