/**
 * Project # 2: Parking.
 * Class name: Motorcycle.
 *
 * @ Andres Prada Rodriguez.                Student Code: 202110069010.
 * @ Mauricio David Correa Hernandez.       Student Code: 202117505010.
 *
 *  Version 1. Date: 24/May/2021.
 */

import java.time.LocalDateTime;

public class Motorcycle extends Vehicle
{
    private String type = "Motorcycle";
    private LocalDateTime dateTimeIn;

    public Motorcycle(){}

    public Motorcycle(String plate, String brand, String color, String type)
    {
        super(plate, brand, color, type,30000000);
        this.dateTimeIn = LocalDateTime.now();
        this.type = type;
    }

    public Motorcycle(String plate, String brand, String color, String type, int commercialValue)
    {
        super(plate, brand, color, type, commercialValue);
        this.dateTimeIn = LocalDateTime.now();
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
}