package model;

public class Employee {
	
	private int id;
	private String first_name;
	private String last_name;
	private int age;
	private double salary;
	private String department;

	//constructor
	public Employee(int id, String first_name, String last_name, int age, double salary, String department){
		this.id=id;
		this.first_name=first_name;
		this.last_name=last_name;
		this.age=age;
		this.salary=salary;
		this.department=department;
	}
	
	//getters
	
	public int getId(){
		return id;
	}
	
	public String getFirstName(){
		return first_name;
	}
	
	public String getLastName(){
		return last_name;
	}
	
	public int getAge(){
		return age;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public String getDepartment(){
		return department;
	}
	
	//setters
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setFirstName(String first_name){
		this.first_name=first_name;
	}
	
	public void setLastName(String last_name){
		this.last_name=last_name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	public void setDepartment(String department){
		this.department=department;
	}
}
