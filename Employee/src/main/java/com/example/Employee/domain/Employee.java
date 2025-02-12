package com.example.Employee.domain;

import java.util.ArrayList;

public class Employee {
	
	private String name;
	private int eId;
	private int age;
	private String dept;
	private String desi;
	private int sal;
	
	public Employee() {}
	
	public Employee(String name, int eId, int age, String dept, String desi, int sal) {
		this.name = name;
		this.eId = eId;
		this.age = age;
		this.dept = dept;
		this.desi = desi;
		this.sal = sal;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesi() {
		return desi;
	}
	public void setDesi(String desi) {
		this.desi = desi;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return name + eId + age + dept + desi + sal;
	}
	
	public String getInfo() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new Employee(name, eId, age, dept, desi, sal);
		
		employees.add(e1);
		
		StringBuilder empInfo = new StringBuilder();
		
		for(Employee e:employees) {
			 empInfo.append(e.name).append(" ")
					.append(e.eId).append(" ")
					.append(e.age).append(" ")
					.append(e.dept).append(" ")
					.append(e.desi).append(" ")
					.append(e.sal).append("\n");
		}
		
		return empInfo.toString();
	}
	
}

