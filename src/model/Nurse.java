package model;

public class Nurse extends Employee{
	
	//extra field
	private String type_of_degree; // Don't use underscores
	
	//constructor
	public Nurse(int id, String first_name, String last_name, int age, double salary, String department, String type_of_degree){
		super(id, first_name, last_name, age, salary, department);
		this.type_of_degree = type_of_degree;
	}
	
	//getter
	
	public String getTypeOfDegree(){
		return type_of_degree;
	}
	
	//setter
	
	public void setTypeOfDegree(String type_of_degree){
		this.type_of_degree=type_of_degree;
	}

}
