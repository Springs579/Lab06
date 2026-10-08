import java.util.Scanner;
public class Task01 {
   public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      double f = 0;
      boolean valid;
      double celcius = 0;
      do {
          System.out.print("Please input your fahrenheit: ");
          if (scanner.hasNextDouble()){
              f = scanner.nextDouble();
              valid = true;
          }
          else{
              scanner.next();
              System.out.println("Invalid Input, Please enter a valid number");
              valid = false;
          }
      } while (!valid);
      celcius = (f-32) * 5/9;
    System.out.print("Your celsius is: " + celcius);

   }
}
