import java.util.Scanner;
import java.util.Arrays;

public class Pontoon 
{
    static Scanner kboard = new Scanner(System.in);


    public static int getRandomNumber()
    {
       return (int) (Math.random() * 10 + 1);
    } // end getRandomNumber

    public static boolean getResult(int total, int house)
    {
        if (total > house && total <= 21)
        {
            return(true);
        } else {
            return(false);
        } // end if
    } // end getResult

    public static boolean busted(int total)
    {
        if (total > 21)
        {
            return(true);
        } else {
            return false;
        }
    } // end busted

    public static int houseNumber()
    {
        int house = (int) (Math.random() * 20);

        while (house < 16)
            {
                house = (int) (Math.random() * 20);
            } 
        
        return (house);
    } // end houseNumber


    public static void main(String[] args)
    {
        String choice = "";
        int card1 = getRandomNumber();
        int card2 = getRandomNumber();
        int newCard = 0;
        int total = card1 + card2;
        int house = houseNumber();
        int[] cardHand = new int[] { card1, card2 };
        

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        
       System.out.println(Arrays.toString(cardHand));
        System.out.println("Would you like to draw another card?  (Y/N) ");
        do
        {
            choice = kboard.next();
            switch (choice)
            {
                case "Y": 
                 case "y":
                    newCard = (int) (Math.random() * 10);
                    System.out.println(newCard);
                    total = total + newCard;
                    
                    System.out.println("Would you like to draw another card? (Y/N) ");
                break; // end case "Y"

                case "N":
                 case "n":
                    if (total >= 19 && total <= 21)
                    {
                        if (total > house)
                        {
                            System.out.println("The total is: " + total);
                            System.out.println("Congratulations, you've won! ");
                            System.out.println("House total: " + house);
                        }
                        
                    } else if (total > 21){
                        System.out.println("Busted! The total is: " + total + ". This is higher than 21.");
                        System.out.println("Bad luck, try again! ");
                        System.out.println("House total: " + house);

                    } else {
                        System.out.println("The total is: " + total);
                        System.out.println("Bad luck, try again! ");
                        System.out.println("House total: " + house);
                    } // end if elseif

                    


                    choice = kboard.next();
                break; // end case "N"


                default:
                {
                    System.out.println("Invalid selection");
                    System.out.println("-----------------");
                }
            }
        }
        while(choice !=  "Y" || choice != "N");
        {
            choice = kboard.nextLine();
        }
        
        
    } // end main

} // end class