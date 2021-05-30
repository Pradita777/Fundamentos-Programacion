import java.util.Scanner;
import java.util.InputMismatchException;
public class Minigame
{

    public static void main(String[] args)
    {
        Bug[][] bugs = new Bug[2][2];
        Scanner scan = new Scanner(System.in);

        int option1;

        do {
            option1 = menu();

            switch (option1)
            {
                case 0:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nYOU ARE LEAVING THE PROGRAM...");
                    System.out.println("THE PROGRAM CLOSED CORRECTLY.");

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n____________________________________________________________");
                    System.out.println("|##########################################################|");
                    System.out.println("|#|  ___________   ____      __.   ____________.         |#|");
                    System.out.println("|#|  |$$$$$$$$$|   |$$$\\     |$|   |$$$$$$$$$$$$\\        |#|");
                    System.out.println("|#|  |$|           |$|\\$\\    |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$|           |$| \\$\\   |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$$$$$$$$$|   |$|  \\$\\  |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$|           |$|   \\$\\ |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$|           |$|    \\$\\|$|   |$\\_________/$/  __.  |#|");
                    System.out.println("|#|  |$$$$$$$$$|   |$|     \\$$$|   |$$$$$$$$$$$/    |$|  |#|");
                    System.out.println("|#|______________________________________________________|#|");
                    System.out.println("|##########################################################|");

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    break;
                }

                case 1:
                {
                    for (int index = 0; index < 2; index++)
                    {
                        for (int jIndex = 0; jIndex < 2; jIndex++)
                        {
                            bugs[index][jIndex] = new Bug("", 0);
                        }
                    }

                    int amountOfBugs = (int) Math.floor(1 + (Math.random() * 4));

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nOH NO!!!!!! they have appeared " + amountOfBugs + " bugs, PLEASEE  exterminate them all before they eat us");

                    int limit = 0;

                    for (int i = 0; i < 2; i++)
                    {
                        for (int j = 0; j < 2; j++)
                        {
                            int creatorOfBugs = (int)Math.floor(1 + (Math.random() * 2));
                            if (limit == amountOfBugs)
                            {
                                break;
                            }
                            else if (creatorOfBugs == 1)
                            {
                                Bug bugs1 = new Bug("BN", 10);
                                limit++;
                                bugs[i][j] = bugs1;
                            }
                            else if(creatorOfBugs == 2)
                            {
                                Bug bugs2 = new Bug("BA", 20);
                                limit++;
                                bugs[i][j] = bugs2;
                            }
                        }
                    }

                    System.out.println("\n BOARD GAME");
                    System.out.println("-------------");
                    for(int index1 = 0; index1 < 2; index1++)
                    {
                        System.out.print("|");
                        for (int jIndex1 = 0; jIndex1 < 2; jIndex1++)
                        {
                            if (bugs[index1][jIndex1].getName().equals(""))
                            {
                                System.out.print("     " + "|");
                            }
                            else
                            {
                                System.out.print(bugs[index1][jIndex1].toString() + "|");
                            }
                        }
                        System.out.println("\n-------------");

                    }
                    System.out.println("");
                    break;
                }


                case 2:
                {
                    try
                    {
                        System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                        System.out.print("Enter the number of the row: ");
                        int row = scan.nextInt()-1;
                        System.out.print("Enter the number of the column: ");
                        int column = scan.nextInt()-1;
                        System.out.println("------------------------------------------------------------------------------------------------------------------");

                        bugs[row][column].attack();

                        if(bugs[row][column].getHealth() == 0)
                        {
                            System.out.println("\nThe bug in the position: row " + (row+1) + " and column " + (column+1) + " is dead.");
                        }

                        System.out.println("\n BOARD GAME");
                        System.out.println("-------------");
                        for (int i = 0; i < 2; i++)
                        {
                            System.out.print("|");
                            for (int j = 0; j < 2; j++)
                            {
                                if (bugs[i][j].getName().equals(""))
                                {
                                    System.out.print("     " + "|");
                                }
                                else
                                {
                                    System.out.print(bugs[i][j].toString() + "|");
                                }
                            }
                            System.out.println("\n-------------");
                        }
                        System.out.println("");
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("This character is not correct, please verify what was required");
                        scan.next();
                    }
                    catch (Exception e)
                    {
                        System.out.println("The space required not exist, try again");
                    }
                }

                if ((bugs[0][0].getHealth() == 0) && (bugs[0][1].getHealth() == 0) && (bugs[1][0].getHealth() == 0) && (bugs[1][1].getHealth() == 0)) {

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nCongratulations you have killed all bugs.");
                    System.out.println("The game is over");
                    option1 = 0;
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nYOU ARE LEAVING THE PROGRAM...");
                    System.out.println("THE PROGRAM CLOSED CORRECTLY.");

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n____________________________________________________________");
                    System.out.println("|##########################################################|");
                    System.out.println("|#|  ___________   ____      __.   ____________.         |#|");
                    System.out.println("|#|  |$$$$$$$$$|   |$$$\\     |$|   |$$$$$$$$$$$$\\        |#|");
                    System.out.println("|#|  |$|           |$|\\$\\    |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$|           |$| \\$\\   |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$$$$$$$$$|   |$|  \\$\\  |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$|           |$|   \\$\\ |$|   |$|          |$|      |#|");
                    System.out.println("|#|  |$|           |$|    \\$\\|$|   |$\\_________/$/  __.  |#|");
                    System.out.println("|#|  |$$$$$$$$$|   |$|     \\$$$|   |$$$$$$$$$$$/    |$|  |#|");
                    System.out.println("|#|______________________________________________________|#|");
                    System.out.println("|##########################################################|");

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    break;
                }
            }
        } while (option1 != 0);
    }

    public static int menu()
    {
        int option;
        try{
            Scanner scan = new Scanner(System.in);

            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("____________________________________________________________________________.");
            System.out.println("|###########################################################################|");
            System.out.println("|#|  ____        ___   ___________   ____      __.   __.         __.      |#|");
            System.out.println("|#|  |$$$\\      /$$|   |$$$$$$$$$|   |$$$\\     |$|   |$|         |$|      |#|");
            System.out.println("|#|  |$|\\$\\   /$/|$|   |$|           |$|\\$\\    |$|   |$|         |$|      |#|");
            System.out.println("|#|  |$| \\$\\ /$/ |$|   |$|           |$| \\$\\   |$|   |$|         |$|      |#|");
            System.out.println("|#|  |$|  \\$$$/  |$|   |$$$$$$$$$|   |$|  \\$\\  |$|   |$|         |$|      |#|");
            System.out.println("|#|  |$|         |$|   |$|           |$|   \\$\\ |$|   |$|         |$|      |#|");
            System.out.println("|#|  |$|         |$|   |$|           |$|    \\$\\|$|   \\$\\_________/$/  __. |#|");
            System.out.println("|#|  |$|         |$|   |$$$$$$$$$|   |$|     \\$$$|    \\$$$$$$$$$$$/   |$| |#|");
            System.out.println("|#|_______________________________________________________________________|#|");
            System.out.println("|###########################################################################|");
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.println("0.  Exit of the program.");
            System.out.println("1.  START THE GAME... or create a new game board");
            System.out.println("2.  You can shoot a bug of you choice.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");

            System.out.print("\n Select an option: ");



            option = scan.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("This character is not correct, please entry an number.");
            option = 3;
        }
        return option;
    }
}