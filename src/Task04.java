import java.util.Random;
import java.util.Scanner;
public class Task04 {
    public static void main(String[]args){
        Scanner input =  new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10) + 1;
        int guess = 0;
        boolean valid;
        do{
            System.out.print("Its time to play a game, Pick a number 1-10 you only have one guess: ");
            if(input.hasNextInt()){
                guess = input.nextInt();
                valid = true;
            }else{
                input.next();
               System.out.println("Please enter a valid number Within the given restriants");
               valid = false;
            }
        }while (!valid || guess < 0 || guess > 10);
        if (guess < num){
            System.out.println("Your guess was to low :(");
            System.out.print("The number was: " + num);
        }
        else if (guess > num){
            System.out.println("Your guess was to high :(");
            System.out.print("The number was: " + num);
        }
        else{
            System.out.print("Right on the money the number was: " + num);
        }
    }
}

