package com.example.demo.model;

public class Output extends Device {
private String resolution;

public String getResolution() {
	return resolution;
}

public void setResolution(String resolution) {
	this.resolution = resolution;
}

public Output(int id, String name, String description, int price, String resolution) {
	super(id, name, description, price);
	this.resolution = resolution;
}

@Override
public String toString() {
	return "Output [resolution=" + resolution + ", Device parameters=" + super.toString() + "]";
}


}
