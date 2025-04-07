import java.util.*;

public class BMICalc {
      public static void calculateBMI() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your weight in kg: ");
          double weight = sc.nextDouble();
          System.out.print("Enter your height in centimeters: ");
          double height = sc.nextDouble();
          double bmi = weight / ((height * height) / 10000);
          System.out.printf("Your BMI is: %.2f\n", bmi);
          if (bmi < 18.5) {
              System.out.println("You are underweight.");
          } else if (bmi < 24.9) {
              System.out.println("You have a normal weight.");
          } else if (bmi < 29.9) {
              System.out.println("You are overweight.");
          } else {
              System.out.println("You are obese.");
          }
      }
      public static void main(String[] args) {
          System.out.println("Welcome to the BMI Calculator!");
          calculateBMI();
          System.out.println("Thank you for using the BMI Calculator!");
      }
}