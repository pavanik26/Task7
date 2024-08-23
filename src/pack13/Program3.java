package pack13;

import java.util.Scanner;

public class Program3 {
	
	static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Error: age below 18");
		}
		else
		{
			System.out.println("age is greater than 18");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {		
		System.out.println("Enter age:");
		int age = sc.nextInt();			
		validateAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		
	}

}
