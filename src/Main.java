/**
 * Project # 2: Parking.
 * Class name: Main.
 *
 * @ Andres Prada Rodriguez.                Student Code: 202110069010.
 * @ Mauricio David Correa Hernandez.       Student Code: 202117505010.
 *
 *  Version original. Date: 29/April/2021.
 *  Version 1. Date: 24/May/2021.
 */
import java.util.InputMismatchException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nTHE PROGRAM IS STARTING...");
        System.out.println("\nGet ready and then here we go...\n");
        Scanner scan= new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("||||SIZE OF THE BUILDING|||    ");
        System.out.print("Please indicate the number of FLOORS of the building: ");
        int numberOfFloors = scan.nextInt();

        System.out.print("Please indicate the number of PARKING SPACES per floor: ");
        int numberOfSpaces = scan.nextInt();

        System.out.println("------------------------------------------------------------------------------------------------------------------");

        System.out.println("||||PARKING PRICES (CAR AND MOTORCYCLE)|||    ");
        System.out.print("Please indicate the price of the CAR parking per second (without dots): ");
        float carPrice = scan.nextFloat();

        System.out.print("Please indicate the price of the MOTORCYCLE parking per second (without dots): ");
        float motorcyclePrice = scan.nextFloat();

        Vehicle.vehicles = new Vehicle[numberOfFloors][numberOfSpaces];
        Sensor.sensors = new Sensor[numberOfFloors][numberOfSpaces];

        Sensor.arrayInitialization();

        int option1;

        do{

            option1 = menu();

            switch (option1)
            {
                case 0:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nYOU ARE LEAVING THE PROGRAM...");
                    System.out.println("Thanks for let us help you... See you soon.");
                    System.out.println("THE PROGRAM CLOSED CORRECTLY.");

                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("____________________________________________________________");
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
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.print(Sensor.emptySensor());
                    break;
                }

                case 2:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nThink in a FLOOR and a SPACE PARKING for parking, and then indicate us...");
                    System.out.println("ATTENTION: Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                            "are " +numberOfSpaces + ". \n");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");

                    try
                    {
                        System.out.print("Please indicate the FLOOR: ");
                        int indexM1 = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int jIndexM1 = scan.nextInt() - 1;
                        System.out.println("------------------------------------------------------------------------------------------------------------------");

                        String plate1, brand1, color1, type1;

                        int status;

                        if ((Sensor.sensors[indexM1][jIndexM1] == null) || (Sensor.sensors[indexM1][jIndexM1].getStatus() == 0))
                        {
                            System.out.println("\nRemember the vehicle plate, brand vehicle and the color of the vehicle, then indicate us...\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------");

                            System.out.print("Please indicate us the VEHICLE PLATE: ");
                            plate1 = scan.next();

                            System.out.print("Please indicate us the VEHICLE BRAND: ");
                            brand1 = scan.next();

                            System.out.print("Please indicate us the VEHICLE COLOR: ");
                            color1 = scan.next();

                            boolean flagTypeVehicule = true;
                            int countTypeVehicule = 0;

                            while(countTypeVehicule <= 3)
                            {
                                System.out.print("Please indicate us the VEHICLE TYPE (Car or Motorcycle): ");
                                type1 = scan.next();

                                System.out.println("------------------------------------------------------------------------------------------------------------------");

                                status = 1;

                                countTypeVehicule = countTypeVehicule + 1;

                                if (type1.equalsIgnoreCase("Car"))
                                {
                                    Vehicle.vehicles[indexM1][jIndexM1] = new Car(plate1, brand1, color1, type1);
                                    Sensor.sensors[indexM1][jIndexM1] = new Sensor(status);
                                    System.out.println(Vehicle.vehicles[indexM1][jIndexM1].toString());
                                    flagTypeVehicule = false;
                                    break;
                                }
                                else if (type1.equalsIgnoreCase("Motorcycle"))
                                {
                                    Vehicle.vehicles[indexM1][jIndexM1] = new Motorcycle(plate1, brand1, color1, type1);
                                    Sensor.sensors[indexM1][jIndexM1] = new Sensor(status);
                                    System.out.println(Vehicle.vehicles[indexM1][jIndexM1].toString());
                                    flagTypeVehicule = false;
                                    break;
                                }
                                System.out.println("It is not a correct type of vehicle, please put Car or Motorcycle.");
                                System.out.println("------------------------------------------------------------------------------------------------------------------");
                            }

                            if(countTypeVehicule == 4)
                            {
                                System.out.println("Invalid option, try again");
                                break;
                            }
                        }

                        else
                        {
                            System.out.println("------------------------------------------------------------------------------------------------------------------");
                            System.out.println("YOU CAN´T ADD THE VEHICLE, THIS SPACE IS OCCUPIED...");
                            System.out.println("TRY AGAIN... but fist select de 2nd option again.");
                        }

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
                    break;
                }

                case 3:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nThink in a FLOOR and a SPACE PARKING for parking, and then indicate us...");
                    System.out.println("ATTENTION... Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                            "are " +numberOfSpaces + ". \n");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");

                    try
                    {
                        System.out.print("Please indicate the FLOOR: ");
                        int index10 = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int jIndex10 = scan.nextInt() - 1;
                        System.out.println("------------------------------------------------------------------------------------------------------------------");

                        String plate2, brand2, color2, type2;
                        int commercialValue1, status2;

                        if ((Sensor.sensors[index10][jIndex10] == null) || (Sensor.sensors[index10][jIndex10].getStatus() == 0))
                        {
                            System.out.println("\nRemember the vehicle plate, brand vehicle, the color of the vehicle and the commercial value of the vehicle,");
                            System.out.println("then indicate us...\n");
                            System.out.println("------------------------------------------------------------------------------------------------------------------");
                            System.out.print("Please indicate us the VEHICLE PLATE: ");
                            plate2 = scan.next();

                            System.out.print("Please indicate us the VEHICLE BRAND: ");
                            brand2 = scan.next();

                            System.out.print("Please indicate us the VEHICLE COLOR: ");
                            color2 = scan.next();

                            System.out.print("Please indicate us the COMMERCIAL VALUE OF THE VEHICLE: ");
                            commercialValue1 = scan.nextInt();

                            boolean flagTypeVehicule1 = true;
                            int countTypeVehicule1 = 0;

                            while(countTypeVehicule1 <= 3)
                            {
                                System.out.print("Please indicate us the VEHICLE TYPE (Car or Motorcycle): ");
                                type2 = scan.next();

                                System.out.println("------------------------------------------------------------------------------------------------------------------");

                                status2 = 1;

                                countTypeVehicule1 = countTypeVehicule1 + 1;

                                if (type2.equalsIgnoreCase("Car"))
                                {
                                    Vehicle.vehicles[index10][jIndex10] = new Car(plate2, brand2, color2, type2, commercialValue1);
                                    Sensor.sensors[index10][jIndex10] = new Sensor(status2);
                                    System.out.println(Vehicle.vehicles[index10][jIndex10].toString());
                                    flagTypeVehicule1 = false;
                                    break;
                                }
                                else if (type2.equalsIgnoreCase("Motorcycle"))
                                {
                                    Vehicle.vehicles[index10][jIndex10] = new Motorcycle(plate2, brand2, color2, type2, commercialValue1);
                                    Sensor.sensors[index10][jIndex10] = new Sensor(status2);
                                    System.out.println(Vehicle.vehicles[index10][jIndex10].toString());
                                    flagTypeVehicule1 = false;
                                    break;
                                }
                                System.out.println("It is not a correct type of vehicle, please put Car or Motorcycle.");
                                System.out.println("------------------------------------------------------------------------------------------------------------------");
                            }
                            if(countTypeVehicule1 == 4)
                            {
                                System.out.println("Invalid option, try again");
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("------------------------------------------------------------------------------------------------------------------");
                            System.out.println("YOU CAN´T ADD THE VEHICLE, THIS SPACE IS OCCUPIED...");
                            System.out.println("TRY AGAIN... but fist select de 3rd option again.");
                        }
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
                    break;
                }

                case 4:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.print(Vehicle.toStringVehicles());
                    break;
                }

                case 5:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n                                                     ________________.");
                    System.out.println("The amount of vehicles parked in the building are:   || " + Vehicle.amountVehicles() + " Vehicles. ||\n");
                    break;
                }

                case 6:
                {
                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nThink in a FLOOR and a SPACE PARKING to check and then indicate us...");
                    System.out.println("ATTENTION: Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                            "are " +numberOfSpaces + ". \n");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");

                    try
                    {
                        System.out.print("Please indicate the FLOOR: ");
                        int indexM2 = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int jIndexM2 = scan.nextInt() - 1;
                        System.out.println("------------------------------------------------------------------------------------------------------------------");

                        if ((Sensor.sensors[indexM2][jIndexM2] == null) || (Sensor.sensors[indexM2][jIndexM2].getStatus() == 0))
                        {
                            System.out.println("The sensor in the floor " + (indexM2+1) + " and in the space parking " + (jIndexM2+1) + " is EMPTY.");
                        }
                        else
                        {
                            System.out.println("The sensor in the floor " + (indexM2+1) + " and in the space parking " + (jIndexM2+1) + " " + Sensor.sensors[indexM2][jIndexM2].toString()+".");
                        }
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
                    break;
                }

                case 7:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.print(Sensor.statusSensor());
                    break;
                }

                case 8:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nThink in a VEHICLE COLOR to check and then indicate us...");
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");

                    System.out.print("Indicate the VEHICLE COLOR to check: ");
                    String colorReceived = scan.next();
                    System.out.println("------------------------------------------------------------------------------------------------------------------");

                    System.out.print(Vehicle.searchColor(colorReceived));
                    break;
                }

                case 9:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.print(Vehicle.orderVehicle());
                    break;
                }

                case 10:
                {
                    System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nThink in a FLOOR and a SPACE PARKING for disable the sensor or get out of the parking lot, and then indicate us...");
                    System.out.println("ATTENTION: Remember that the maximum of FLOORS are " + numberOfFloors + " and the maximum of SPACE PARKING " +
                            "are " +numberOfSpaces + ". \n");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

                    try
                    {
                        System.out.print("Please indicate the FLOOR: ");
                        int indexM3 = scan.nextInt() - 1;

                        System.out.print("Please indicate the SPACE PARKING: ");
                        int jIndexM3 = scan.nextInt() - 1;
                        System.out.println("------------------------------------------------------------------------------------------------------------------");


                        if ((Sensor.sensors[indexM3][jIndexM3] != null) && (Sensor.sensors[indexM3][jIndexM3].getStatus() == 1))
                        {
                            float price = 0;
                            LocalDateTime dateTimeNow = LocalDateTime.now();
                            Vehicle vehicle = Vehicle.vehicles[indexM3][jIndexM3];
                            Sensor.sensors[indexM3][jIndexM3].setStatus(0);
                            Vehicle.vehicles[indexM3][jIndexM3] = null;
                            System.out.println("The vehicle got out of the parking correctly...");
                            Vehicle.amount--;

                            long timeIntoParking = Duration.between(vehicle.getDateTimeIn(),dateTimeNow).toSeconds();

                            if (vehicle.getType().equalsIgnoreCase("Car"))
                            {
                                price = carPrice;
                            }
                            else if (vehicle.getType().equalsIgnoreCase("Motorcycle"))
                            {
                                price = motorcyclePrice;
                            }

                            float finalPayment = price*timeIntoParking;
                            System.out.println("------------------------------------------------------------------------------------------------------------------");
                            System.out.println("|| Plate: " + vehicle.getPlate() + " || Brand: " + vehicle.getBrand() + " || Color: " + vehicle.getColor() + " || Commercial Value: " + vehicle.getCommercialValue() +
                                    " || Type: " + vehicle.getType() + " ||");
                            System.out.println("------------------------------------------------------------------------------------------------------------------");
                            System.out.println("Time you came in: " + vehicle.getDateTimeIn());
                            System.out.println("Time you get out: " + dateTimeNow);
                            System.out.println("Type of vehicle: " + vehicle.getType());
                            System.out.println("Price: " + price);
                            System.out.println("Time you where here: " + timeIntoParking + " seconds");
                            System.out.println("Your payment: " + finalPayment);

                        }
                        else
                        {
                            System.out.println("No vehicles into this floor and space Parking... Check again.");
                        }
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
                    break;
                }

                case 11:
                {
                    System.out.print("Please entry the name of the file to create the list of all vehicles: ");
                    String nameFile = scan.next();
                    Vehicle forFile = new Vehicle();
                    forFile.createAFile(nameFile + ".txt");
                    System.out.println("------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Your file was created correctly...");
                    break;
                }
                /*case 12:
                {
                    break;
                }*/
                default:
                {
                    System.out.println("\n------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nATTENTION... The command is incorrect, please try again using the numbers between 0 to 11.\n");
                    break;
                }
            }
        }while(option1 != 0);
    }


    // Method Menu.
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
            System.out.println("0.  Exit.");
            System.out.println("1.  Search the free sensors.");
            System.out.println("2.  Add a new vehicle without commercial value.");
            System.out.println("3.  Add a new vehicle with commercial value.");
            System.out.println("4.  See all vehicles.");
            System.out.println("5.  Amount of vehicles.");
            System.out.println("6.  Status of a specific parking space.");
            System.out.println("7.  Status of ALL of the parking spaces.");
            System.out.println("8.  Enter a color and the cars that have the same color will be displayed.");
            System.out.println("9.  Sort by commercial value (lower to upper).");
            System.out.println("10. Disable a sensor or get out of the parking lot.");
            System.out.println("11. Export to a flat file (.txt) all vehicles parked in the parking.");
            System.out.println("------------------------------------------------------------------------------------------------------------------");

            System.out.print("\n Select an option: ");



            option = scan.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("\n------------------------------------------------------------------------------------------------------------------");
            System.out.println("\nThis character is not correct, please entry an number.");
            option = 12;
        }
        return option;
    }
}