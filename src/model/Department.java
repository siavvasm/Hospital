package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private Doctor director;
	private List<Character> num_of_buildings = new ArrayList<Character>();

	//Constructor
	
	public Department(String name, Doctor director, List<Character> num_of_buildings){
		this.name=name;
		this.director=director;
		this.num_of_buildings=num_of_buildings;
	}
	
	public String getName(){
		return name;
	}
		
	public void setName(String name){
		this.name=name;
	}

	public Doctor getDirector() {
		return director;
	}

	public void setDirector(Doctor director) {
		this.director = director;
	}

	public List<Character> getNum_of_buildings() {
		return num_of_buildings;
	}

	public void setNum_of_buildings(List<Character> num_of_buildings) {
		this.num_of_buildings = num_of_buildings;
	}
}
