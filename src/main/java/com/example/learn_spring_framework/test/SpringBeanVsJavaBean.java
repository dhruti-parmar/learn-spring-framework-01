package com.example.learn_spring_framework.test;

import java.io.Serializable;

//pojo-plain old java object
//Any java obj is pojo
class Pojo{
	private String text;
	private int number;
	
	@Override
	public String toString() {
		return "Pojo [text=" + text + ", number=" + number + "]";
	}
}

//EJB-Enterprise java beans
class JavaBean implements Serializable{
	
	//1. public no arg constructor
	
	public JavaBean() {
		
	}
	
	private String text;
	private int number;
	
	//2: getter and setters
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
public class SpringBeanVsJavaBean {

	public static void main(String[] args) {
		
		Pojo pojo = new Pojo();
		System.out.println(pojo);

	}

}
