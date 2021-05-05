/**
 * Project # 1: Parking.
 * Class name: Main.
 *
 * @ Jose Simon Atehortua.                  Student Code: 202110059010.
 * @ Andres Prada Rodriguez.                Student Code: 202110069010.
 * @ Mauricio David Correa Hernandez.       Student Code: 202117505010.
 *
 *  Version original. Date: 29/April/2021.
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\nTHE PROGRAM IS STARTING...");
        System.out.println("\nGet ready and then here we go...\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.print("Please indicate the number of FLOORS of the building: ");
        int numberOfFloors = scan.nextInt();

        System.out.print("Please indicate the number of PARKING SPACES per floor: ");
        int numberOfSpaces = scan.nextInt();

        Vehicle.vehicles = new Vehicle[numberOfFloors][numberOfSpaces];
        Sensor.sensors = new Sensor[numberOfFloors][numberOfSpaces];

        Sensor.arrayInitialization();

        int option;

        do{

            option = menu();

            switch (option)
            {
                    case 0:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("\nYOU ARE LEAVING THE PROGRAM...");
                        System.out.println("Thanks for let us help you... See you soon.");
                        System.out.println("THE PROGRAM IS CLOSED CORRECTLY.");

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

                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        break;
                    }

                    case 1:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.print(Sensor.emptySensor());
                        break;
                    }

                    case 2:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("\nThink in a FLOOR and a SPACE PARKING for parking, and then indicate us...");
                        System.out.println("ATTENTION: Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                                "are " +numberOfSpaces + ". \n");
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        System.out.print("Please indicate the FLOOR: ");
                        int i = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int j = scan.nextInt() - 1;
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        String plate1, brand1, color1;

                        int status;
                        if ((Sensor.sensors[i][j] == null) || (Sensor.sensors[i][j].getStatus() == 0))
                        {
                            System.out.println("\nRemember the car plate, brand car and the color of the car, then indicate us...\n");
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.print("Please indicate us the CAR PLATE: ");
                            plate1 = scan.next();

                            System.out.print("Please indicate us the CAR BRAND: ");
                            brand1 = scan.next();

                            System.out.print("Please indicate us the CAR COLOR: ");
                            color1 = scan.next();
                            System.out.println("----------------------------------------------------------------------------------------------------");

                            status = 1;

                            Sensor.sensors[i][j] = new Sensor(status);
                            Vehicle.vehicles[i][j] = new Vehicle(plate1, brand1, color1);

                            System.out.println(Vehicle.vehicles[i][j].toString());
                        }
                        else
                        {
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.println("YOU CAN´T ADD THE CAR, THIS SPACE IS OCCUPIED...");
                            System.out.println("TRY AGAIN... but fist select de 2nd option again.");
                        }
                        break;
                    }

                    case 3:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("\nThink in a FLOOR and a SPACE PARKING for parking, and then indicate us...");
                        System.out.println("ATTENTION... Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                                "are " +numberOfSpaces + ". \n");
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        System.out.print("Please indicate the FLOOR: ");
                        int index10 = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int jIndex10 = scan.nextInt() - 1;
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        String plate2, brand2, color2;
                        int commercialValue1, status2;

                        if ((Sensor.sensors[index10][jIndex10] == null) || (Sensor.sensors[index10][jIndex10].getStatus() == 0))
                        {
                            System.out.println("\nRemember the car plate, brand car, the color of the car and the commercial value, then indicate us...\n");
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.print("Please indicate us the CAR PLATE: ");
                            plate2 = scan.next();

                            System.out.print("Please indicate us the CAR BRAND: ");
                            brand2 = scan.next();

                            System.out.print("Please indicate us the CAR COLOR: ");
                            color2 = scan.next();

                            System.out.print("Please indicate us the COMMERCIAL VALUE: ");
                            commercialValue1 = scan.nextInt();
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            status2 = 1;

                            Sensor.sensors[index10][jIndex10] = new Sensor(status2);
                            Vehicle.vehicles[index10][jIndex10] = new Vehicle(plate2, brand2, color2, commercialValue1);

                            System.out.println(Vehicle.vehicles[index10][jIndex10].toString());
                        }
                        else
                        {
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.println("YOU CAN´T ADD THE CAR, THIS SPACE IS OCCUPIED...");
                            System.out.println("TRY AGAIN... but fist select de 3rd option again.");
                        }
                        break;
                    }

                    case 4:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.print(Vehicle.toStringVehicles());
                        break;
                    }

                    case 5:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("\n                                                     ________________.");
                        System.out.println("The amount of vehicles parked in the building are:   || " + Vehicle.amountVehicles() + " Vehicles. ||\n");
                        break;
                    }

                    case 6:
                    {
                        System.out.println("\n---------------------------------------------------------------------------------------------------");
                        System.out.println("\nThink in a FLOOR and a SPACE PARKING to check and then indicate us...");
                        System.out.println("ATTENTION: Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                                "are " +numberOfSpaces + ". \n");
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        System.out.print("Please indicate the FLOOR: ");
                        int i4 = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int j4 = scan.nextInt() - 1;
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        if ((Sensor.sensors[i4][j4] == null) || (Sensor.sensors[i4][j4].getStatus() == 0))
                        {
                            System.out.println("The sensor in the floor " + (i4+1) + " and in the space parking " + (j4+1) + " is EMPTY.");
                        }
                        else
                        {
                            System.out.println("The sensor in the floor " + (i4+1) + " and in the space parking " + (j4+1) + " " + Sensor.sensors[i4][j4].toString()+".");
                        }
                        break;
                    }

                    case 7:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.print(Sensor.statusSensor());
                        break;
                    }

                    case 8:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("\nThink in a CAR COLOR to check and then indicate us...");
                        System.out.println("\n----------------------------------------------------------------------------------------------------");

                        System.out.print("Indicate the CAR COLOR to check: ");
                        String colorReceived = scan.next();
                        System.out.println("----------------------------------------------------------------------------------------------------");

                        System.out.print(Vehicle.searchColor(colorReceived));
                        break;
                    }

                    case 9:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.print(Vehicle.orderVehicle());
                        break;
                    }

                    default:
                    {
                        System.out.println("\n----------------------------------------------------------------------------------------------------");
                        System.out.println("\nATTENTION... The command is incorrect, please try again using the numbers between 0 to 9.\n");
                        break;
                    }
            }
        } while(option != 0);
    }

    // Method Menu.
    public static int menu()
    {
        Scanner scan= new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------------------------------------");
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
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("0. Exit.");
        System.out.println("1. Search the free sensors.");
        System.out.println("2. Add a new vehicle without commercial value.");
        System.out.println("3. Add a new vehicle with commercial value.");
        System.out.println("4. See all vehicles.");
        System.out.println("5. Amount of vehicles.");
        System.out.println("6. Status of a specific parking space.");
        System.out.println("7. Status of ALL of the parking spaces.");
        System.out.println("8. Enter a color and the cars that have the same color will be displayed.");
        System.out.println("9. Sort by commercial value (lower to upper).");
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.print("\n Select an option: ");


        int op;
        op = scan.nextInt();

        return op;
    }
}