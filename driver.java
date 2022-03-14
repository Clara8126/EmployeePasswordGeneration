package com.greatlearning.driver;
import com.greatlearning.employee.employee;
import com.greatlearning.CredentialService.CredentialService;
import java.util.Scanner;

public class driver{
	
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	 System.out.println("Enter First Name");
	 String firstName = scan.nextLine(); 
	 System.out.println("Enter Last Name");
	 String lastName= scan.nextLine();
	 int option;
	 String selection =new String();
	 System.out.println("Please enter the number of the department from the following \n 1. Technical \n 2. Admin \n 3. Human Resource \n 4."
				+ "Legal");
		do {
       option = scan.nextInt();
		  if(option <1 || option >4)
		  {
			  System.out.println("Please enter a valid input");
		  }
		}while(option <1 || option >4);
		if(option == 1)
		{
			selection = "technical";
		}
		else if(option == 2)
		{
			selection = "admin";
		}
		else if(option == 3)
		{
			selection = "hr";
		}
		else
		{
			selection = "legal";
		}
		employee emp = new employee(firstName,lastName);
		emp.setdepartment(selection);
		CredentialService cs = new CredentialService();
		emp.setEmail(cs.generateEmail(emp.firstName, emp.lastName,emp.department,emp.company));
		cs.generatePassword();
		System.out.println("Dear "+firstName +"Your generated credential are as follows");
		System.out.print("Email ------>");
		System.out.println(emp.getEmail());
		System.out.print("Password------>");
		System.out.println(cs.password);
		
	}
}
