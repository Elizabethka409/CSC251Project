public class Policy {
      // all instance fields of Policy class
      private int policy_number;
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
      public Policy(int number, String provider, String first_name, String last_name, int age, String status, double height, double weight) { 
         policy_number = number;
         provider_name = provider;
         policyholder_first_name = first_name;
         policyholder_last_name = last_name;
         policyholder_age = age;
         policyholder_smoking_status = status;
         policyholder_height = height;
         policyholder_weight = weight;
      }
      
   // getter and setter methods for each field
      // @param number the policy number
      public void setNumber(int number) {
         policy_number = number;
      }
      
      // @return the policy number
      public int getNumber() {
         return policy_number;
      }
      
      
      // @param provider the provider name
      public void setProvider(String provider) {
         provider_name = provider;
      }
      
      // @return the provider name
      public String getProvider() {
         return provider_name;
      }
      

      // @param first_name the policyholder's first name
      public void setFirstName(String first_name) {
         policyholder_first_name = first_name;
      }
      
      // @return the policyholder's first name
      public String getFirstName() {
         return policyholder_first_name;
      }
      

      // @param last_name the policyholder's last name
      public void setLastName(String last_name) {
         policyholder_last_name = last_name;
      }
      
      // @return the policyholder's last name
      public String getLastName() {
         return policyholder_last_name;
      }
      

      // @param age the policyholder's age
      public void setAge(int age) {
         policyholder_age = age;
      }
      
      // @return the policyholder's age
      public int getAge() {
         return policyholder_age;
      }
      
         
       // @param status the policyholder's smoking status
       // status keywords are "smoker" or "non-smoker"
      public void setStatus(String status) {
         policyholder_smoking_status = status;
      }
      
      // @return the policyholder's smoking status
      public String getStatus() {
         return policyholder_smoking_status;
      }
         
         
      // @param height the policyholder's height, in inches
      // height should be in inches
      public void setHeight(double height) {
         policyholder_height = height;
      }
      
      // @return the policyholder's height, in inches
      public double getHeight() {
         return policyholder_height;
      }
      
         
      // @param weight the policyholder's weight, in pounds
      // weight should be in pounds
      public void setWeight(double weight) {
         policyholder_weight = weight;
      }
      
      // @return the policyholder's weight, in pounds
      public double getWeight() {
         return policyholder_weight;
      }
}