package model;

import java.util.ArrayList;
import java.util.List;

public class Hospitality {
	
	private int patient_id; // Don't use underscores
	private List<Integer> doctor_id = new ArrayList<Integer>(); // Don't use underscores
	private String check_in; // Don't use underscores
	private String check_out; // Don't use underscores
	
	//constructor
	
	public Hospitality(int patient_id, List<Integer> doctor_id, String check_in, String check_out){
		this.patient_id=patient_id;
		this.doctor_id=doctor_id;
		this.check_in=check_in;
		this.check_out=check_out;
	}

	public int getPatient_id() { // Don't use underscores
		return patient_id;
	}

	public void setPatient_id(int patient_id) { // Don't use underscores
		this.patient_id = patient_id;
	}

	public List<Integer> getDoctor_id() { // Don't use underscores
		return doctor_id;
	}

	public void setDoctor_id(List<Integer> doctor_id) { // Don't use underscores
		this.doctor_id = doctor_id;
	}

	public String getCheck_in() { // Don't use underscores
		return check_in;
	}

	public void setCheck_in(String check_in) { // Don't use underscores
		this.check_in = check_in;
	}

	public String getCheck_out() { // Don't use underscores
		return check_out;
	}

	public void setCheck_out(String check_out) { // Don't use underscores
		this.check_out = check_out;
	}

	public int getPatientId(){
		return patient_id;
	}
	
	public void setPatientId(int patient_id){
		this.patient_id=patient_id;
	}

}
