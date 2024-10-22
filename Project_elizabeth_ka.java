import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class Project_elizabeth_ka {
   public static void main(String[] args) throws IOException {
      
      // creating file to read from
      try {
         File txtfile = new File("PolicyInformation.txt");
         Scanner input = new Scanner(txtfile);
      
      // declaring variables that will save each type of data from the policy
      String policy_number, provider_name, first_name,
      last_name, smoking_status = "non-smoker", line;
      double height, weight;
      int age;
      
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
         height = input.nextDouble();
         weight = input.nextDouble();
         
         line = input.nextLine();

         
         // creating policy object
         Policy p = new Policy(policy_number, provider_name, first_name, last_name, age, smoking_status, height, weight);
      
         PolicyList.add(p);
         
         
         // to skip blank space in text file    
         if (input.hasNext()) {
            line = input.nextLine();
         }
      }
      
      // closing file.
      input.close();
      
      
      // accumulator variables 
      int nonsmokers = 0;
      int smokers = 0;
      
      // for loop to 
      for (int i = 0; i <= PolicyList.size(); i++) {           
         System.out.println("Policy Number: " + PolicyList.get(i).getNumber());
         System.out.println("Prov12ider Name: " + PolicyList.get(i).getProvider());
         System.out.println("Policyholder's First Name: " + PolicyList.get(i).getFirstName());
         System.out.println("Policyholder's Last Name: " + PolicyList.get(i).getLastName());
         System.out.println("Policyholder's Age: " + PolicyList.get(i).getAge());
         System.out.println("Policyholder's Smoking Status: " + PolicyList.get(i).getStatus());
         System.out.println("Policyholder's Height: " + PolicyList.get(i).getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + PolicyList.get(i).getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", PolicyList.get(i).calcBMI());
         System.out.printf("Policy Price: $%.2f\n", PolicyList.get(i).calcInsurancePolicy());
         System.out.println();
         }
         
         
         if (smoking_status.toLowerCase() == "smoker") {
            smokers++;
         }
         if (smoking_status.toLowerCase() == "non-smoker") {
            nonsmokers++;
         }
      
      System.out.print("\nThe number of policies with a smoker is: " + smokers);
      System.out.print("\nThe number of policies with a non-smoker is: " + nonsmokers);
      }
      
      catch (IOException ex) {
         System.out.println("There was a problem with the file: " + ex.getMessage());
      }
   }
}