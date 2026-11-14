import java.util.Scanner;
import java.util.Random;
public class GuessGame 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        do 
        {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();
            if (guess > number) 
                {
                System.out.println("Too high!");
            }
            else if (guess < number) 
                {
                System.out.println("Too low!");
            }
            else 
                {
                System.out.println("Correct! You won.");
            }

        } while (guess != number);
        sc.close();
    }
}