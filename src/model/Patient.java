package model;

public class Patient {
	
	private int id;
	private String first_name; // Don't use underscores
	private String last_name; // Don't use underscores
	private int insurance_id;
	private double weight;
	private double height;
	private String blood_type; // Don't use underscores
	private String insurance;
	
	//constructor
	
	public Patient(int id, String first_name, String last_name, int insurance_id, double weight, double height, String blood_type, String insurance){
		this.id=id; // Leave spaces between mathematical signs
		this.first_name=first_name;
		this.last_name=last_name;
		this.insurance_id=insurance_id;
		this.weight=weight;
		this.height=height;
		this.blood_type=blood_type;
		this.insurance=insurance;
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
	
	public int getInsuranceId(){
		return insurance_id;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double getHeight(){
		return height;
	}
	
	public String getBloodType(){
		return blood_type;
	}
	
	public String getInsurance(){
		return insurance;
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
	
	public void setInsuranceId(int insurance_id){
		this.insurance_id=insurance_id;
	}
	
	public void setWeight(double weight){
		this.weight=weight;
	}
	
	public void setHeight(double height){
		this.height=height;
	}
	
	public void setBloodType(String blood_type){
		this.blood_type=blood_type;
	}
	
	public void setInsurance(String insurance){
		this.insurance=insurance;
	}
	

}
