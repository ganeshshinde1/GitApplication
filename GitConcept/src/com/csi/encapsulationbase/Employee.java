package com.csi.encapsulationbase;
//ADDED BY GANESH SHINDE
public class Employee {
private int empId;
private String empName;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setEmpId(121);
	e1.setEmpName("GANESH SHINDE");
	System.out.println("\n Employee Id:"+e1.getEmpId()+"\n Employee Name:"+e1.getEmpName());
}
}
