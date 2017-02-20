package model;

import java.util.ArrayList;
import java.util.List;

public class Hospitality {
	
	private int patient_id;
	private List<Integer> doctor_id = new ArrayList<Integer>();
	private String check_in;
	private String check_out;
	
	//constructor
	
	public Hospitality(int patient_id, List<Integer> doctor_id, String check_in, String check_out){
		this.patient_id=patient_id;
		this.doctor_id=doctor_id;
		this.check_in=check_in;
		this.check_out=check_out;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public List<Integer> getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(List<Integer> doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getCheck_in() {
		return check_in;
	}

	public void setCheck_in(String check_in) {
		this.check_in = check_in;
	}

	public String getCheck_out() {
		return check_out;
	}

	public void setCheck_out(String check_out) {
		this.check_out = check_out;
	}

	public int getPatientId(){
		return patient_id;
	}
	
	public void setPatientId(int patient_id){
		this.patient_id=patient_id;
	}

}
