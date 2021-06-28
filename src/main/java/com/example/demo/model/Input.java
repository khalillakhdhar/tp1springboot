package com.example.demo.model;

public class Input extends Device {
private int capacity;

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public Input(int id, String name, String description, int price, int capacity) {
	super(id, name, description, price);
	this.capacity = capacity;
}

@Override
public String toString() {
	return "Input [capacity=" + capacity + ", Device parameters=" + super.toString() + "]";
}




}
