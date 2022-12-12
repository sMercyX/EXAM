package test;

import exam.Department;
import exam.Person;

import java.util.Arrays;

public class ProjectDriver {

    public static void main(String[] args) {
		    testPerson();
			testDepartment();
    }

	public static void testPerson() {
		// Constructor: Person(firstname, lastname, type)
		Person ps1 = new Person(null,null,-1);
		Person ps2 = new Person("Firstname","  ",-3);
		Person ps3 = new Person("","Lastname",2);
		// Constructor: Person (firstname, lastname)
		Person ps4 = new Person("First","Last");
		Person ps5 = new Person(null,"Surname");
		// Getters: getCode(), getFirstname(), getLastname(), getType()
		System.out.println(ps1.getCode());
		System.out.println(ps2.getFirstname());
		System.out.println(ps3.getLastname());
		System.out.println(ps4.getType());
		// Setters: setFirstname(), setLastname()
		ps1.setFirstname("OMG");
		ps1.setLastname("PLZ");
		// toString()
		System.out.println(ps1.toString());
		System.out.println(ps2.toString());
		System.out.println(ps3.toString());
		System.out.println(ps4.toString());
		System.out.println(ps5.toString());
		// equals()
		System.out.println("Is ps1 equal to ps2 ? " + ps1.equals(ps2));
		System.out.println("Is ps4 equal to ps5 ? " + ps4.equals(ps5));
	}

	public static void testDepartment() {
		// Constructor: Department(title)
		Department dp1 = new Department(null);
		Department dp2 = new Department("");
		Department dp3 = new Department("Dept");
		// Getters: getCode(), getTitle(), getCount()
		System.out.println(dp1.getCode());
		System.out.println(dp2.getTitle());
		System.out.println(dp3.getCount());
		// addStaff(firstname, lastname, type)
		dp1.addStaff(" ", "LAST", 2);
		dp2.addStaff("LAST", null, 4);
		dp3.addStaff("FIRST", "LAST", -1);
		dp3.addStaff("SECOND", "LAST", -4);
		dp3.addStaff("THIRD", "LAST", -2);
		dp3.addStaff("FOURTH", "LAST", -4);
		dp3.addStaff("FIFTH", "LAST", -2);
		dp3.addStaff("SIXTH", "LAST", -4);
		dp3.addStaff("SEVENTH", "LAST", -3);
		dp3.addStaff("EIGHTH", "LAST", 5);
		System.out.println(dp3.getCount());
		// getTypeCount(type)
		System.out.println(dp3.getTypeCount(-4));
		// getAllCodes()
		System.out.println(Arrays.toString(dp3.getAllCodes()));
		// getStaff(code)
		System.out.println(dp3.getStaff(17));
		// toString()
		System.out.println(dp1);
		System.out.println(dp2);
		System.out.println(dp3);
		// getAllTypes()
		System.out.println(Arrays.toString(dp3.getAllTypes()));
	}
}


