import java.util.Scanner;

public class Pontoon 
{
    static Scanner kboard = new Scanner(System.in);

    public static int getRandomNumber()
    {
        int randomNumber = (int) (Math.random() * 10 + 1);
        return(randomNumber);
    }

    public static int calcTotal(int card1, int card2)
    {
        return(card1+card2);
    }

    public static boolean getResult(int total)
    {
        if (total > 19 && total < 21)
        {
            return(true);
        } else {
            return(false);
        }
    }

    public static boolean busted(int total)
    {
        if (total > 21)
        {
            return(true);
        } else {
            return false;
        }


    }

    public static void main (String[] args)
    {
        String choice = "";
        int card1 = 5;
        int card2 = 8;
        int newCard = 0;
        int total = card1 + card2;

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);

        System.out.println("Would you like to draw another card?  (Y/N) ");
        choice = kboard.next();

        while (choice == "Y" || choice == "y");
        {
            newCard = (int) (Math.random() * 10);
            System.out.println(newCard);
            total = total + newCard;
            System.out.println("Would you like to draw another card? (Y/N) ");
            choice = kboard.next();
        }

        if (total > 19 && total < 21)
        {
            System.out.println("The total is: " + total);
            System.out.println("Congratulations, you've won! ");
        } else {
            System.out.println("The total is: " + total);
            System.out.println("Bad luck, try again! ");
        }





    }



}