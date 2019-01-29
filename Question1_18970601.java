import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question1_18970601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		int age = 0;
		String gender = "";
		String email = "";
		int salary = 0;
		String quit = "no";
		String fileName = "salaries.txt";
		
		do {
		System.out.println("What is your age?");
		age = kb.nextInt();
		age = checkAgeRange(age);
		
		System.out.println("What is your Gender?");
		gender = kb.next();
		
		System.out.println("What is your Email Address?");
		email = kb.next();
		
		System.out.println("What is you Yearly Salary?");
		salary = kb.nextInt();
		salary = checkSalary(salary);
		
		System.out.println("would you like to quit (yes or no)");
		quit = kb.next();
		
		createFile(fileName, age, gender, email, salary );
		
		}while(quit.equals("no"));
		System.out.println("Quitted succesfully");
		
		kb.close();
	}
	
	/**
	 * 
	 * @param age the users age
	 * @return an age between 20 to 30
	 */
	public static int checkAgeRange( int age) {
		Scanner kb = new Scanner(System.in);
		
		while(age < 20 || age > 30) {
			System.out.println("What is your age? (range 20-30)");
			age = kb.nextInt();
		}
		
		return(age);
	}
	
	public static int checkSalary(int salary) {

		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		
		while(salary < 40000 || salary > 150000) {
			System.out.println("What is you Yearly Salary? (range 40000-150000)");
			salary = kb.nextInt();
		}
		
		return(salary);
	}
	
	
	/**
	 * 
	 * @param fileName the file name
	 * @param age users age
	 * @param gender the gender of the user
	 * @param email the users email
	 * @param salary the users salary
	 * 
	 * 
	 * this is all written to a file
	 */
	public static void createFile(String fileName, int age, String gender, String email, int salary) {
		// creating the file within a try method

	
		PrintWriter outputFile = null;
		try {
			 outputFile = new PrintWriter(new FileOutputStream(new File(fileName),true));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		outputFile.println(age + ";" + gender + ";" + email + ";" + salary);
		
		//closing the file
		outputFile.close();
		}
}
