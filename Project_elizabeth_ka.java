import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_elizabeth_ka {
   // method to instantiate policy object
   public static void main(String[] args) throws IOException {
      // declaring variables
      String policy_number, provider_name, first_name, last_name, line;
      int age, numOfSmokers = 0;
      String smoking_status;
      double height = 0.0;
      double weight = 0.0;
      
      // creating file to read from
         File txtfile = new File("PolicyInformation.txt");
         Scanner input = new Scanner(txtfile);
      
      // creating arraylist to store objects
      ArrayList<Policy> PolicyList = new ArrayList<Policy>();
      
      // reading and saving each line of information from the text file
      while (input.hasNext()) {
         policy_number = input.nextLine();
         provider_name = input.nextLine();
         first_name = input.nextLine();
         last_name = input.nextLine();
         age = input.nextInt();
         smoking_status = input.nextLine();
         weight = input.nextDouble();
                  
         // to skip blank line in text file    
         if (input.hasNext()) {
            line = input.nextLine();
         }
         // creating policy object
         // demo = name of policy
         Policy demo = new Policy(policy_number, provider_name, first_name, last_name, age, smoking_status, height, weight);
         PolicyList.add(demo);         
      }
      
      // closing file.
      input.close();
      
      // Runs through all lines from txtfile and displays a policy report back to console
      for (Policy demo : PolicyList) {
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
      
            if(demo.getStatus().equalsIgnoreCase("smoker")) { // to keep track of the number of smokers 
               numOfSmokers++;
         }
         
         System.out.print("\nThe number of policies with a smoker is: " + numOfSmokers);
         System.out.print("\nThe number of policies with a non-smoker is: " + (PolicyList.size() - numOfSmokers));
      }  
   }
}
