/**
 * Project # 2: Parking.
 * Class name: Car.
 *
 * @ Andres Prada Rodriguez.                Student Code: 202110069010.
 * @ Mauricio David Correa Hernandez.       Student Code: 202117505010.
 *
 *  Version 1. Date: 24/May/2021.
 */

import java.time.LocalDateTime;

public class Car extends Vehicle
{
    private String type = "Car";
    private LocalDateTime dateTimeIn;

    public Car(){}

    public Car(String plate, String brand, String color, String type)
    {
        super(plate, brand, color, type,30000000);
        this.dateTimeIn = LocalDateTime.now();
        this.type = type;
    }

    public Car(String plate, String brand, String color, String type, int commercialValue)
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