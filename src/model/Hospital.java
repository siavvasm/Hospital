package model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	private List<Employee> employee = new ArrayList<Employee>();
	private List<Department> department = new ArrayList<Department>();
	private List<Patient> patient = new ArrayList<Patient>();
	private List<Measurement> measurement = new ArrayList<Measurement>();
	private List<Hospitality> hospitality = new ArrayList<Hospitality>();
	
	//constructor
	
	public Hospital(List<Employee> employee, List<Department> department, List<Patient> patient, List<Measurement> measurement, List<Hospitality> hospitality){
		this.employee=employee;
		this.department=department;
		this.patient=patient;
		this.measurement=measurement;
		this.hospitality=hospitality;
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public List<Measurement> getMeasurement() {
		return measurement;
	}

	public void setMeasurement(List<Measurement> measurement) {
		this.measurement = measurement;
	}

	public List<Hospitality> getHospitality() {
		return hospitality;
	}

	public void setHospitality(List<Hospitality> hospitality) {
		this.hospitality = hospitality;
	}

	public void printEmployee(){
		for(Employee e:employee){
			System.out.println("Employee: " +e.getClass()+" "+ e.getFirstName()+" "+e.getLastName());
		}
	}
		
	public void printDepartment(){
		for(Department d:department){
			System.out.println("Department: " + d.getName());
		}
	}
		
	public List<Employee> belongTo(String departmentName){
		List<Employee> empl = new ArrayList<Employee>();
		System.out.println("The employees that belong to " +departmentName+" "+ "are: ");
		for (Employee e : employee){
			if (e.getDepartment().equals(departmentName)){
				empl.add(e);
				System.out.println(e.getLastName());
			}
		}
		return empl;
	}
}
