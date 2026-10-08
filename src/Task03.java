import java.util.Scanner;
public class Task03 {
    public static void main(String[]args){
        Scanner input =  new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean valid;
        do{
            System.out.print("Please enter the width of your rectangle: ");
            if (input.hasNextDouble()){
                width = input.nextDouble();
                valid = true;
            }else{
                input.next();
                System.out.println("You entered a incorrect Width value, Please try again ");
                valid = false;
            }
        }while(!valid || width <= 0);
        do{
            System.out.print("Please enter the height of your rectangle: ");
            if(input.hasNextDouble()){
                height = input.nextDouble();
                valid = true;
            }else{
                input.next();
                System.out.println("Incorrect height value, Please try again");
                valid = false;
            }
        }while(!valid || height <= 0);
        double area = width * height;
        double perimeter = 2 * (height+width);
        double diagonal = Math.sqrt((width * width) + (height * height));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
