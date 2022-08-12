package Personas;

public class Persona {
	
	// Attributes
	private String firstName;
	private String middleName;
	private String surName;
	private String secondSurName;
	private String gender;
	private int dateOfBirth;
	
	//Builder 
	public Persona(String firstName, String middleName, String surName, String secondSurName, String gender,
			int dateOfBirth) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.secondSurName = secondSurName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
	}
	
	//Getters and Setters

	public Persona(String firstName2, String middleName2, String surName2, String secondSurName2, String gender2,
			int dayBirth, int monthBirth, int yearBirth) {
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}


	public String getSurName() {
		return surName;
	}

	public String getSecondSurName() {
		return secondSurName;
	}

	public String getGender() {
		return gender;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}
}
