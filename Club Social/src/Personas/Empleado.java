package Personas;

public class Empleado extends Persona {
	
	private int employeeNumber;
	private int hireDate;
	private String jobPosition;
	
	public Empleado(String firstName, String middleName, String surName, String secondSurName, String gender,
			int dateOfBirth, int employeeNumber, int hireDate, String jobPosition) 
	{
		super(firstName, middleName, surName, secondSurName, gender, dateOfBirth);
		this.employeeNumber = employeeNumber;
		this.hireDate = hireDate;
		this.jobPosition = jobPosition;
	}
	
	public void showData()
	{
		System.out.println("Full name: "+ getFirstName()+ getMiddleName()+ getSurName() + getSecondSurName());
		System.out.println("Gender: "+ getGender());
		System.out.println("Date of Birth: "+ getDateOfBirth());
	}
	
	

}
