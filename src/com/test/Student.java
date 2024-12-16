package com.test;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Student o) {
//		return name.compareTo(o.getName());
		if(id==o.getId()) {
			return 0;
		}else if (id>o.getId()) {
			return 1;
		}else {
			return -1;
		}
	}

}
