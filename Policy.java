import java.util.Scanner;

public class Policy {
      // all instance fields of Policy class
      private String policy_number;
      private String provider_name;
      private String policyholder_first_name;
      private String policyholder_last_name;
      private int policyholder_age;
      private String policyholder_smoking_status;
      private double policyholder_height;
      private double policyholder_weight;
      
      // no-arg constructor for default purposes
      public Policy() {
      }
      
      // parametrized constructor that accepts all neccessary arguments to fully initialize the Policy object
      public Policy(String number, String provider, String first_name, String last_name, int age, String status, double height, double weight) { 
         policy_number = number;
         provider_name = provider;
         policyholder_first_name = first_name;
         policyholder_last_name = last_name;
         policyholder_age = age;
         policyholder_smoking_status = status;
         policyholder_height = height;
         policyholder_weight = weight;
      }
      
      // initializing scanner object to retrieve user data
      Scanner input = new Scanner(System.in);
      
   // getter and setter methods for each field
      // @param number the policy number
      public void setNumber(String number) {
         System.out.println("Please enter the Policy Number: ");
         policy_number = input.nextLine();
         
         policy_number = number;
      }
      
      // @return the policy number
      public String getNumber() {
         return policy_number;
      }
      
      
      // @param provider the provider name
      public void setProvider(String provider) {
         System.out.println("Please enter the Provider Name: ");
         provider_name = input.nextLine();
         
         provider_name = provider;
      }
      
      // @return the provider name
      public String getProvider() {
         return provider_name;
      }
      

      // @param first_name the policyholder's first name
      public void setFirstName(String first_name) {         
         System.out.println("Please enter the Policyholder’s First Name: ");
         policyholder_first_name = input.nextLine();
         
         policyholder_first_name = first_name;
      }
      
      // @return the policyholder's first name
      public String getFirstName() {
         return policyholder_first_name;
      }
      

      // @param last_name the policyholder's last name
      public void setLastName(String last_name) {
         System.out.println("Please enter the Policyholder’s Last Name: ");
         policyholder_last_name = input.nextLine();
         
         policyholder_last_name = last_name;
      }
      
      // @return the policyholder's last name
      public String getLastName() {
         return policyholder_last_name;
      }
      

      // @param age the policyholder's age
      public void setAge(int age) {
         System.out.println("Please enter the Policyholder’s Age: ");
         policyholder_age = input.nextInt();
         
         policyholder_age = age;
      }
      
      // @return the policyholder's age
      public int getAge() {
         return policyholder_age;
      }
      
         
       // @param status the policyholder's smoking status
       // status keywords are "smoker" or "non-smoker"
      public void setStatus(String status) {
         System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
         policyholder_smoking_status = input.nextLine();
         
         // while(policyholder_smoking_status != "smoker" || policyholder_smoking_status != "non-smoker")
         
         policyholder_smoking_status = status;
      }
      
      // @return the policyholder's smoking status
      public String getStatus() {
         return policyholder_smoking_status;
      }
         
         
      // @param height the policyholder's height, in inches
      // height should be in inches
      public void setHeight(double height) {
         System.out.println("Please enter the Policyholder’s Height (in inches): ");
         policyholder_height = input.nextDouble();
         
         policyholder_height = height;
      }
      
      // @return the policyholder's height, in inches
      public double getHeight() {
         return policyholder_height;
      }
      
         
      // @param weight the policyholder's weight, in pounds
      // weight should be in pounds
      public void setWeight(double weight) {
         System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
         policyholder_weight = input.nextDouble();
         
         policyholder_weight = weight;
      }
      
      // @return the policyholder's weight, in pounds
      public double getWeight() {
         return policyholder_weight;
      }
      
      
      // @param BMI the policyholder's BMI
      // @return the policyholder's BMI
      public double calcBMI() {
         return (policyholder_weight * 703) / (policyholder_height * policyholder_height); // = BMI
      }
      
      
      
      // @param price the policyholder's insurance policy price based on a number of factors
      public double calcInsurancePolicy() {
         // initializing method variables
         final double BASE_FEE = 600; // 600 for the base fee of the insurance policy
         final double AGE_FEE = 75;
         final double SMOKER_FEE = 100;
         final double BMI_FEE = 20; // 20 minimum
         
         double price = BASE_FEE;
         
         final int AGE_THRESHOLD = 50;
         final int BMI_THRESHOLD = 35;
         
         // if statements to determine if conditions apply to policyholder, if so, add fee
         if(policyholder_age > AGE_THRESHOLD) { // over 50 years
            price += AGE_FEE; // $75 fee
         }
            
         if(policyholder_smoking_status.equalsIgnoreCase("smoker")) {
            price += SMOKER_FEE; // $100 fee
         }
               
         // calls calcBMI method
         if(calcBMI() > BMI_THRESHOLD) { // BMI over 35
            price += ((calcBMI() - BMI_THRESHOLD) * BMI_FEE);
         }

         
      // @return price of policy after fees applied    
         return price;
      }
}