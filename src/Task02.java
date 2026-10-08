import java.util.Scanner;
public class Task02 {
    public static void main(String[]args){
        Scanner input =  new Scanner(System.in);
        double tank = 0;
        double mpg = 0;
        double price = 0;
        boolean valid;
        do {
            System.out.print("Please enter the number of gallons in your tank: ");
            if (input.hasNextDouble()){
            tank = input.nextDouble();
            valid = true;
            }
            else{
                input.next();
                System.out.println("You entered an invalid Parameter, Please enter proper ammount of gallons");
                valid = false;
            }
        } while (!valid || tank < 0);
        do{
            System.out.print("Please enter the mpg: ");
            if (input.hasNextDouble()){
                mpg = input.nextDouble();
                valid = true;
            }
            else{
                input.next();
                System.out.println("Invalid Parameter, Please enter a proper MPG");
                valid = false;
            }
        } while (!valid ||mpg < 0);
        do{
            System.out.print("Please enter the Price per gallon: ");
            if(input.hasNextDouble()){
                price = input.nextDouble();
                valid = true;
            }
            else{
                input.next();
                System.out.println("Invalid input, Please enter a proper price per gallon");
                valid = false;
            }
        } while (!valid ||price < 0);
       double cost100 = (100 / mpg) * price;
       double distance = (tank * mpg);
       System.out.println("It would cost you $" + cost100 + " to go 100 miles");
       System.out.print("You could go " + distance + " miles on a full tank of gas");
    }

}
