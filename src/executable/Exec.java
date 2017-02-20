package executable;

import java.util.ArrayList;
import java.util.List;

import model.Department;
import model.Doctor;
import model.Employee;
import model.Hospital;
import model.Hospitality;
import model.Measurement;
import model.Nurse;
import model.Patient;

public class Exec {

	public static void main(String[] args) {
		
		/*
		 *  1. Definition of the Hospital object fields
		 */
		// Your variables should be more descriptive (and more than three letters :P)
		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();
		List<Integer> dl1 = new ArrayList<Integer>();
		List<Integer> dl2 = new ArrayList<Integer>();
		
		
		List<Doctor> doc = new ArrayList<Doctor>(); // call this list something like doctors. Do the same for the other variables.
		List<Nurse> nur = new ArrayList<Nurse>();
		List<Employee> empl = new ArrayList<Employee>();
		List<Patient> pat = new ArrayList<Patient>();
		List<Department> dep = new ArrayList<Department>();
		List<Hospitality> hosp = new ArrayList<Hospitality>();
		List<Measurement> meas = new ArrayList<Measurement>();
		
		l1.add('A');
		l1.add('B');
		l1.add('C');
		
		l2.add('D');
		l2.add('E');
		l2.add('F');
		
		dl1.add(1);
		dl2.add(2);
		
		Doctor doc1 = new Doctor(1,"George","Papadopoulos",45,3000,"D1","pathologist","fully");
		Doctor doc2 = new Doctor(2,"Mary","Smith",40,2500,"D2","dentist","fully");
		
		// Alternatively:
		// doctors.add(new Doctor(1,"George","Papadopoulos",45,3000,"D1","pathologist","fully"));
		//

		Nurse n1 = new Nurse(1,"Kate","Tale",30,700,"D1","university");
		Nurse n2 = new Nurse(2,"Pete","Brown",31,700,"D2","school");
		
		Patient p1 = new Patient(1,"Chris","L",1234,70,180,"AB","IKA");
		Patient p2 = new Patient(2,"Laura","M",5678,50,160,"A+","IKA");

		Department d1 = new Department("D1", doc1, l1);
		Department d2 = new Department("D2", doc2, l2);
		
		Hospitality h1 = new Hospitality(1, dl1, "17/02/2017" , "19/2/2017");
		Hospitality h2 = new Hospitality(2, dl2, "18-2-2017", "18-2-2017");
		
		Measurement m1 = new Measurement("Blood Pressure", 12, "no clue", "2017-02-17", 1,1);
		Measurement m2 = new Measurement("Hematocrit", 38, "no clue", "2017-02-18", 2,2);
		
		/*
		 * 2. Add the individual objects to the appropriate lists
		 */
		doc.add(doc1);
		doc.add(doc2);
		
		nur.add(n1);
		nur.add(n2);
		
		empl.add(doc1);
		empl.add(doc2);
		empl.add(n1);
		empl.add(n2);

		pat.add(p1);
		pat.add(p2);
		
		dep.add(d1);
		dep.add(d2);
		
		hosp.add(h1);
		hosp.add(h2);
		
		meas.add(m1);
		meas.add(m2);
		
		/*
		 * 3. Create the Hospital object containing the predefined info
		 */
		
		Hospital hospital = new Hospital(empl,dep,pat,meas,hosp);
		
		/*
		 * 4. Printing info about the hospital
		 */
		
		hospital.printEmployee();
		hospital.printDepartment();
		hospital.belongTo("D1");

	}

}
