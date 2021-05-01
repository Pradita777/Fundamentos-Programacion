/**
 * Project # 1: Parking.
 * Class name: Vehicle.
 *
 * @ Jose Simon Atehortua.                  Student Code: 202110059010.
 * @ Andres Prada Rodriguez.                Student Code: 202110069010.
 * @ Mauricio David Correa Hernandez.       Student Code: 202117505010.
 *
 *  Version original. Date: 29/April/2021.
 */

public class Vehicle
{
    public static Vehicle[][] vehicles;
    public static int size;
    public static int amount = 0;

    private String plate;
    private String brand;
    private String color;
    private int commercialValue;

    public Vehicle(String plate, String brand, String color)
    {
        this(plate, brand, color,30000000);
    }

    public Vehicle(String plate, String brand, String color, int commercialValue)
    {
        this.plate = plate;
        this.brand = brand;
        this.color = color;
        this.commercialValue = commercialValue;

        amount++;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setCommercialValue(int commercialValue)
    {
        this.commercialValue = commercialValue;
    }

    public String getPlate()
    {
        return this.plate;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public String getColor()
    {
        return this.color;
    }

    public int getCommercialValue()
    {
        return this.commercialValue;
    }

    public String toString()
    {
        return "|| Plate: " + getPlate() +" || Brand: " + getBrand() + " || Color: " + getColor() + " || Commercial Value: " + getCommercialValue() + " ||";
    }

    public static String toStringVehicles()
    {
        String stringVehicles = "";

        for(int index4 = 0; index4 < vehicles.length; index4++)
        {
            for(int jIndex4 = 0; jIndex4 < vehicles[0].length; jIndex4++)
            {
                if (vehicles[index4][jIndex4] != null)
                {
                    stringVehicles += vehicles[index4][jIndex4].toString()+"\n";
                }
            }
        }
        return stringVehicles;
    }


    public static int amountVehicles()
    {
        return amount;
    }

    public static String searchColor(String colorReceived)
    {
        boolean exists = false;
        String colorSearch = "";

        for(int index5 = 0; index5 < vehicles.length;index5++)
        {
            for(int jIndex5 = 0; jIndex5 < vehicles[0].length; jIndex5++)
            {
                if(vehicles[index5][jIndex5] != null)
                {
                    if(vehicles[index5][jIndex5].getColor().equalsIgnoreCase(colorReceived))
                    {
                        exists = true;

                        colorSearch += vehicles[index5][jIndex5].toString()+"\n";
                    }
                }
            }
        }

        if(!exists)
        {
            colorSearch += "No car with that color '" + colorReceived + "' has parking here...\n";
        }
        return colorSearch;
    }

    public static void orderArray(Vehicle[] vehicle2)
    {
        Vehicle[] temp = new Vehicle[amount];
        for(int index6 = 1; index6 < amount ; index6++)
        {
            for(int jIndex6 = 0; jIndex6 < amount - 1; jIndex6++)
            {
                if(vehicle2[jIndex6].getCommercialValue() > vehicle2[jIndex6+1].getCommercialValue())
                {
                    temp[jIndex6] = vehicle2[jIndex6];
                    vehicle2[jIndex6] = vehicle2[jIndex6+1];
                    vehicle2[jIndex6+1] = temp[jIndex6];
                }
            }
        }
    }

    public static String orderVehicle()
    {
        String orderedList = "";
        int index8 = 0;

        Vehicle[] vehicle2 = new Vehicle[amount];

        for(int index7 = 0; index7<vehicles.length;index7++)
        {
            for(int jIndex7 = 0; jIndex7<vehicles[0].length; jIndex7++)
            {
                if(vehicles[index7][jIndex7] != null)
                {
                    vehicle2[index8] = vehicles[index7][jIndex7];
                    index8++;
                }
            }
        }

        orderArray(vehicle2);

        for(int index9 = 0; index9 <amount; index9++)
        {
            orderedList += vehicle2[index9].toString() + "\n";
        }

        return orderedList;
    }
}