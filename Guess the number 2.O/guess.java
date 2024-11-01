import java.util.*;

public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand_number = (int)(Math.random()*100);
        int user_input = 1;
        do
        {
            System.out.println("Welcome to the Guessing Game!");
            System.out.println("Try to guess the number between 1 and 100.");
            System.out.println("Enter 0 to quit the game.");
            // System.out.println(rand_number);
            try {
                user_input = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("---------- Invalid input -----------");
                sc.next();
                continue;
            }
            if(user_input < rand_number) 
            {
                System.out.println("Your choice is smaller than the answer");
            }
            if(user_input > rand_number)
            {
                System.out.println("Your choice is greater than the answer");
            }
            
            if(user_input == 0) 
            {
                System.out.println("The End");
                break;
            }
            if(user_input == rand_number)
            {
                System.out.println("Congradulations\nYou won!");
                break;
            }
        }while(user_input>0);

        
    }
}
