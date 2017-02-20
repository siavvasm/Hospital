package model;

public class Measurement {
	
	private String name;
	private double value;
	private String unit;
	private String date;
	private int id;
	private int patient_id;
	
	//constructor
	
	public Measurement(String name, double value, String unit, String date, int id, int patient_id){
		this.name=name;
		this.value=value;
		this.unit=unit;
		this.date=date;
		this.id=id;
		this.patient_id=patient_id;
	}
	
	public String getName(){
		return name;
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public void setName(String name){
		this.name=name;
	}

}
