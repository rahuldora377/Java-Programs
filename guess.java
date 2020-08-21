import java.util.*;
class guess
{
    public static void main(String[] args)
    {
        System.out.println("###################### welcome TO Guess Game ######################");
        // Object Creation Start
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        // Object Creation End
        int guess_store, guess_time = 0, guess_by_user, user_guess_value, guess_number;
        System.out.println("1. Enter Custom Maximun Guess Value");
        System.out.println("2. Let me Guess A Number For You");
        System.out.print("Choice: ");
        guess_by_user = input.nextInt();
        if(guess_by_user == 1)
        {
            System.out.print("Enter Maximun Guess Value: ");
            user_guess_value = input.nextInt();
            guess_number = rand.nextInt(user_guess_value);
        }
        else
        {
            guess_number = rand.nextInt(50);
        }
        System.out.println("Guess Number: ");
        guess_store = input.nextInt();

        while(true)
        {
            if(guess_store == guess_number)
            {
                System.out.println("You own by Guessing " + guess_time + " Times");
                break;
            }
            else if(guess_store > guess_number)
            {
                System.out.println("Too High...");
                System.out.println("Guess Again: ");
                guess_store = input.nextInt();
                guess_time++;
            }
            else
            {
                System.out.println("Too low...");
                System.out.println("Guess Again: ");
                guess_store = input.nextInt();
                guess_time++;
            }
        }

    }
}