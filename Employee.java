package com.orilore.dk.test;

public class Employee {

private String employeeno;
private String employeename;
public Employee(String employeeno,String employeename){
	this.employeename= employeename;
	this.employeeno = employeeno;
}
public String getEmployeeno() {
	return employeeno;
}
public void setEmployeeno(String employeeno) {
	this.employeeno = employeeno;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
	}


