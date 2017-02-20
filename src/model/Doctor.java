package model;

public class Doctor extends Employee{
	
	//extra fields
	private String field_of_specialty; // Don't use underscores
	private String type_of_employment; //either fully or intern
	
	//Constructor
	public Doctor(int id, String first_name, String last_name, int age, double salary, String department, String field_of_specialty, String type_of_employment){
		super(id,first_name, last_name, age, salary, department);
		this.field_of_specialty = field_of_specialty;
		this.type_of_employment = type_of_employment;
	}
	
	//getters
	
	public String getFieldOfSpecialty(){ // Nice! (Camel Case Writing)
		return field_of_specialty;
	}
	
	public String getTypeOfEmployment(){ // Nice! (Camel Case Writing)
		return type_of_employment;
	}
	
	//setters
	
	public void setFieldOfSpecialty(String field_of_specialty){ // Nice! (Camel Case Writing)
		this.field_of_specialty=field_of_specialty;
	}
	
	public void setTypeOfEmployment(String type_of_employment){ // Nice! (Camel Case Writing)
		this.type_of_employment=type_of_employment;
	}

}
