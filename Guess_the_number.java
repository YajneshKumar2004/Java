import java.util.*;
public class Guess_the_number
{
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number between 1-6: ");
        Random rand = new Random();
        int guess = rand.nextInt(1,7);
        for(int i=0; i<4; i++)
        {
            try{
                n = sc.nextInt();
                if(n == guess) {
                    System.out.println("\nHURRAY!\nYour guess was right!");
                    System.out.print("The number was " + guess);
                    break;
                }
                else{
                    if(i<3)
                    {
                        int remainingAttempt = 3-i;
                        System.out.println("Oops... You're wrong");
                        System.out.println("You have " + remainingAttempt + " more " + ((remainingAttempt == 1)? "attempt" : "attempts"));
                        System.out.print("You can try again: ");
                    }
                    else{
                        System.out.println("You've run out of attempts. The correct answer was " + guess);
                    }
                }
            }
            catch(InputMismatchException e){
                System.out.print("------Invalid input------ \nPlease enter a number: ");
                sc.next();
                i--;
            }
            
        }
        sc.close();
        
    }
}