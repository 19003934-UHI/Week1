// Improved Guessing Game found in Head First Java, this revised version allows four people to guess a random number between 0-9.
// The game keeps repeating if no-one wins until there's a winner.
// 11/09/2020
// Peter Pasieka
// v1.3

import java.util.Scanner;

public class GuessingGame // start of class
{
    // declare players 
    Player p1;
    Player p2;
    Player p3;
    Player p4;

    public void startGame() // start of startGame
    {
        // start of new game
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p4 = new Player();

        // declare player guesses as variables
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        int guessP4 = 0;

        // ensure one player does not always win
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        boolean p4isRight = false;

        // randomly pick a number from 0-9 and round it up
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("---------------------------------------");
        System.out.println("I'm thinking of a number between 0 and 9 . . . ");

        // start of while loop
        while(true)
            {
               
                System.out.println("Player 1 is guessing . . . ");
               p1.guess();
                System.out.println("Player 2 is guessing . . . ");
               p2.guess();
                System.out.println("Player 3 is guessing . . . ");
               p3.guess();
                System.out.println("Player 4 is guessing . . . ");
               p4.guess();
               
               System.out.println("---------------------------------------");
               guessP1 = p1.number;
               System.out.println("Player one guessed " + guessP1); // Player one and the number they guessed

               guessP2 = p2.number;
               System.out.println("Player two guessed " + guessP2); // Player two and the number they guessed

               guessP3 = p3.number;
               System.out.println("Player three guessed " + guessP3); // Player three and the number they guessed

               guessP4 = p4.number;
               System.out.println("Player three guessed " + guessP4); // Player four and the number they guessed
               System.out.println("---------------------------------------");

               if (guessP1 == targetNumber)
                    {
                        p1isRight = true;
                    }
               if (guessP2 == targetNumber)
                    {
                        p2isRight = true;
                    }
               if (guessP3 == targetNumber)
                    {
                        p3isRight = true;
                    }
                if (guessP4 == targetNumber)
                    {
                        p4isRight = true;
                    }

                if (p1isRight || p2isRight || p3isRight || p4isRight) // compare the results of every player
                    {
                        System.out.println("And we have a winner!");
                        System.out.println("Did Player One get the number right? " + p1isRight);
                        System.out.println("Did Player Two get the number right? " + p2isRight);
                        System.out.println("Did Player Three get the number right? " + p3isRight);
                        System.out.println("Did Player Four get the number right? " + p4isRight);
                        System.out.println("---------------------------------------");
                        System.out.println("The number was . . . " + targetNumber);
                        System.out.println("Game over!"); // only reached if p1, p2 or p3 is correct
                        System.out.println("---------------------------------------");
                        break;
                    } else // if no players are correct, then begin again
                    { 
                        System.out.println("The number was . . . " + targetNumber);
                        System.out.println("No players guessed correctly, try again!");
                        System.out.println("---------------------------------------");
                    }
            } // end of while loop
    } // end of startGame

    public class Player // manages variables for the player class
    {
        int number = 0;
        Scanner kboard = new Scanner(System.in);
            public int guess()
            {
                number = kboard.nextInt();
                System.out.println("I guess the number . . . " + number);
    
                return(number); 
            } // end guess method

    } // end of Player class

    public static class GameLauncher // handles the launch of the game
    {
        public static void main(String[] args) 
        {
            GuessingGame game = new GuessingGame();
            game.startGame();
        }
    } // end of GameLauncher class


} // end of class