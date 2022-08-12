package Personas;


import java.util.Scanner;

public class Main {
	
	public static void main (String [] args)
	{
		
		Scanner entrada = new Scanner(System.in);
		String firstName, middleName, surName, secondSurName, gender;
		int dayBirth, monthBirth, yearBirth;
		int numberEmployees, numberMembers;
		int option, menuOption;
		boolean exit = false;

		
		option = entrada.nextInt();
		
		do {
			
			System.out.print("**************TERRAZA CLUB*****************");
			System.out.println("************ WELCOME ********************");
			System.out.println("\n");
			System.out.println("PLEASE SELLECT ONE OF THE FOLLOWING OPTIONS");
			System.out.println("1) MEMBERS AREA \n");
			System.out.println("2) EMPLOYEES AREA \n");
			System.out.println("3) EXIT PROGRAM \n");
		
			switch (option)
			
			{ 
			case 1: 
				
				System.out.println("WELCOME TO MEMBERS AREA\n");
				System.out.println("PLEASE USE THE FOLLOWING MENU OPTIONS: \n");
				System.out.print("1) Add Members: ");
				System.out.println("2) See Members: ");
				System.out.print("3) Go to previous menu: ");
				menuOption = entrada.nextInt();
				
				do 
				{
				switch (menuOption)
				{
				case 1:
					
					System.out.println("Please select the the amount of employees to add: ");
				    numberMembers = entrada.nextInt();
				    
				   Persona members[] = new Persona [numberMembers];
				    
				    for (int i = 0; i < members.length; i++)
					{
						entrada.nextLine();
						System.out.println("Please add the following information" + (i+1)+ ": ");
						System.out.print("\n First Name: ");
						firstName = entrada.nextLine();
						System.out.print("\n Middle Name: ");
						middleName = entrada.nextLine();
						System.out.print("\n First Last Name: ");
						surName = entrada.nextLine();
						System.out.print("\n Second Last Name: ");
						secondSurName = entrada.nextLine();
						System.out.print("\n Gender: ");
						gender = entrada.nextLine();
						System.out.print("\n Date of Birth: (dd/MM/YYYY)");
						dayBirth = entrada.nextInt();
						monthBirth = entrada.nextInt();
						yearBirth = entrada.nextInt();
						
						members[i] = new Persona (firstName, middleName, surName,secondSurName, gender, dayBirth, monthBirth, yearBirth);
					
					}
					
					break;
					
				case 2:
					System.out.println("<============ LIST OF CURRENT MEMBERS ============>");
					
					for (int i = 0; i < members.length; i++)
					{
						System.out.println((i+1)+ "Member: "+i);
					}
				break;				
				default:
					System.out.println("Please choose a right option");
					break;
				
				} 
			}while (menuOption == 3);
		
			case 2: 
				
				System.out.println("WELCOME TO EMPLOYEES AREA\n");
				System.out.println("PLEASE USE THE FOLLOWING MENU OPTIONS: \n");
				System.out.print("1) Add Employees: ");
				System.out.println("2) See Employeess: ");
				System.out.print("3) Go to previous menu: ");
				menuOption = entrada.nextInt();
				
				do
				{
					
					switch (menuOption) 
					{
					case 1: 
						System.out.println("Please select the the amount of employees to add: ");
					    numberEmployees = entrada.nextInt();
					    
					    Persona employees[] = new Persona [numberEmployees]; 
					    
					    for (int i = 0; i < employees.length; i++)
						{
							entrada.nextLine();
							System.out.println("Please add the following information" + (i+1)+ ": ");
							System.out.print("\n First Name: ");
							firstName = entrada.nextLine();
							System.out.print("\n Middle Name: ");
							middleName = entrada.nextLine();
							System.out.print("\n First Last Name: ");
							surName = entrada.nextLine();
							System.out.print("\n Second Last Name: ");
							secondSurName = entrada.nextLine();
							System.out.print("\n Gender: ");
							gender = entrada.nextLine();
							System.out.print("\n Date of Birth: (dd/MM/YYYY)");
							dayBirth = entrada.nextInt();
							monthBirth = entrada.nextInt();
							yearBirth = entrada.nextInt();
							
							employees[i] = new Persona (firstName, middleName, surName,secondSurName, gender, dayBirth, monthBirth, yearBirth);
						}
						break;
					case 2:
						
						System.out.println("<============ LIST OF CURRENT MEMBERS ============>");
						
						for (int i = 0; i < employees.length; i++)
						{
							System.out.println((i+1)+ "Member: "+i);
						}
						
						break;
					default:
						System.out.println("Please choose a right option");
						break;
					
					}	
				}while(menuOption == 3);
				
			case 3:
				exit = true;
				break;
			default:
				System.out.println("Please privide an option from 1 - 3");
			break;
			}
			
			}while (!exit);	
		}
	}
