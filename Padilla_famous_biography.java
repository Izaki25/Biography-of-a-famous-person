package padilla_famous_biography;

import java.util.Scanner;

public class Padilla_famous_biography {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        // Variables
        String name, birthplace, birthMonth;
        int age, birthDay, birthYear;
        
        // Input
        System.out.println("Please enter the name of a famous person:");
        name = scan.nextLine();
        
        System.out.println("Enter their age:");
        age = scan.nextInt();
        
   
        scan.nextLine(); 

        System.out.println("Enter their birth day (e.g., 15):");
        birthDay = scan.nextInt();
        
       
        scan.nextLine();
        
        System.out.println("Enter Month of birth (e.g., January):");
        birthMonth = scan.nextLine();
        
        System.out.println("Enter the year of birth:");
        birthYear = scan.nextInt();
        
    
        scan.nextLine();
        
        System.out.println("Enter Place of birth:");
        birthplace = scan.nextLine();
        
        
        System.out.println("Enter their occupation:");
        String job = scan.nextLine();
        
        System.out.println("Enter their networth:");
        double income = scan.nextDouble();
         
        scan.nextLine();
        
        System.out.println("Status (alive or dead): ");
        String status = scan.nextLine();
        
        System.out.println("Famous for:");
        String fame = scan.nextLine();
   
        // Output
        System.out.println("------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Date of Birth: " + birthMonth + " " + birthDay + ", " + birthYear);
        System.out.println("Occupation: " +job);
        System.out.println("Networth: "+income);
        System.out.println("Status:" +status);
        System.out.println("Famous for: " +fame );
        System.out.println("------------------------------------------------");
        
        scan.close();  
    }
}
