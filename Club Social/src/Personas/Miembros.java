package Personas;

public class Miembros extends Persona {
	
	private int membershipNumber;
	private int dateIssued;
	private int dateExpiration;
	
	//Builder of child class
	
	public Miembros(String firstName, String middleName, String surName, String secondSurName, 
			String gender, int dateOfBirth, int membershipNumber, int dateIssued, int dateExpiration)
	{
		super (firstName, middleName, surName, secondSurName, gender, dateOfBirth);
		this.membershipNumber = membershipNumber;
		this.dateIssued = dateIssued;
		this.dateExpiration = dateExpiration;
	}

	public void showData()
	{
		System.out.println("Full name: "+ getFirstName()+ getMiddleName()+ getSurName() + getSecondSurName());
		System.out.println("Gender: "+ getGender());
		System.out.println("Date of Birth: "+ getDateOfBirth());
	}
	
}
