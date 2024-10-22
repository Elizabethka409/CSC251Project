import java.util.Scanner;

public class Project_elizabeth_ka {
   // method to instantiate policy object
   public static void main(String[] args) {
      // declaring variables
      String policy_number;
      String provider_name;
      String first_name;
      String last_name;
      int age;
      String smoking_status;
      double height;
      double weight;
      Scanner input = new Scanner(System.in);      
      
      
      // retrieving user input
      System.out.print("Please enter the Policy Number: ");
      policy_number = input.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      provider_name = input.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      first_name = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      last_name = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = input.nextInt();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smoking_status = input.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = input.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = input.nextDouble();
      
      
      // Creating new policy object 
      Policy demo = new Policy(policy_number, provider_name, first_name, last_name, age, smoking_status, height, weight);
      
      
      // calling displayInformation() method
      //displayInformation(policy_number, provider_name, first_name, last_name, age, smoking_status, height, weight);
      System.out.println("Policy Number: " + demo.getNumber());
      System.out.println("Provider Name: " + demo.getProvider());
      System.out.println("Policyholder's First Name: " + demo.getFirstName());
      System.out.println("Policyholder's Last Name: " + demo.getLastName());
      System.out.println("Policyholder's Age: " + demo.getAge());
      System.out.println("Policyholder's Smoking Status (Y/N): " + demo.getStatus());
      System.out.println("Policyholder's Height: " + demo.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + demo.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", demo.calcBMI());
      System.out.printf("Policy Price: $%.2f\n", demo.calcInsurancePolicy());
   }
}