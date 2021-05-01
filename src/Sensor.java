/**
 * Project # 1: Parking.
 * Class name: Sensor.
 *
 * @ Jose Simon Atehortua.                  Student Code: 202110059010.
 * @ Andres Prada Rodriguez.                Student Code: 202110069010.
 * @ Mauricio David Correa Hernandez.       Student Code: 202117505010.
 *
 *  Version original. Date: 29/April/2021.
 */

public class Sensor
{
    public static Sensor[][] sensors;

    private int status;

    public Sensor()
    {
        this.status = 0;
    }

    public Sensor(int status1)
    {
        this.status = status1;
    }

    public void setStatus(int status2)
    {
        this.status = status2;
    }

    public int getStatus()
    {
        return status;
    }

    public String toString()
    {
        return "is "+(getStatus() == 0?"EMPTY":"OCCUPIED"); // Ternary operator.
    }

    public static String emptySensor()
    {
        String value = "";
        for(int index1 = 0; index1<sensors.length; index1++)
        {
            for (int jIndex1 = 0; jIndex1<sensors[0].length; jIndex1++)
            {
                if ((sensors[index1][jIndex1] == null)||(sensors[index1][jIndex1].getStatus() == 0))
                {
                    value += "The sensor in floor " + (index1+1) + " and space " + (jIndex1+1) + " is EMPTY.\n";
                }
            }
        }
        return value;
    }

    public static String statusSensor()
    {
        String value1 = "";
        for(int index2 = 0; index2 < sensors.length; index2++)
        {
            for (int jIndex2 = 0; jIndex2<sensors[0].length; jIndex2++)
            {
                value1 += "Floor " + (index2+1) + " and space " + (jIndex2+1) +" " + sensors[index2][jIndex2].toString()+"\n";
            }
        }
        return value1;
    }

    public static void arrayInitialization()
    {
        for(int index3 = 0; index3<sensors.length; index3++)
        {
            for (int jIndex3 = 0; jIndex3<sensors[0].length; jIndex3++)
            {
                sensors[index3][jIndex3] = new Sensor();
            }
        }
    }
}