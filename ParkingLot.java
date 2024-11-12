import java.util.ArrayList;
import java.util.Stack;

public class ParkingLot
{
    ArrayList<Vehicle> vlist= new ArrayList<Vehicle>();
    ArrayList<slot> slist = new ArrayList<slot>();
    int total_slots;

    public ParkingLot(int total_slots)
    {
        this.total_slots = total_slots;
    }

    void addvehicle(Vehicle a)
    {
        int check = 0;
        if (slist.isEmpty())
        {
            System.out.println("NO SLOTS AVAILABLE");
        }
        else
        {
            for (int i=0;i<slist.size();i++)
            {
                if (slist.get(i).isoccupied == false ) // check if slots are free
                {
                    slist.get(i).assignvehicle(a);
                    System.out.println("VEHICLE PARKED\n");
                    check =1;
                    break;
                }
            }
            if (check != 1)
            {
                System.out.println("VEHICLE CANNOT BE PARKED: NO SLOT FREE");
            }
        }
    }

    void removevehicle(String liscencepl)
    {
         Vehicle h = null;

        for (int i=0;i<vlist.size();i++)
        {
            if (vlist.get(i).getLiscenceplate().equals(liscencepl))
            {
                h = vlist.get(i);
            }
        }

        for (int i=0;i<slist.size();i++)
        {
            if (slist.get(i).parkedvehicle.getLiscenceplate().equals(liscencepl))
            {
                slist.get(i).removevehicle(h);
            }
        }
        System.out.println("VEHICLE REMOVED FROM PARKING");
    }

    void display_slots()
    {
        if (slist.isEmpty())
        {
            System.out.println("SLOTS LIST IS EMPTY");
        }
        else
        {
            for (int i=0;i<slist.size();i++)
            {
                slist.get(i).display();
            }
        }
    }

    void mostused()
    {
        int max = 0;
        int index = 0;
        for (int i=0;i<slist.size();i++)
        {
            if (slist.get(i).count > max)
            {
                max = slist.get(i).count;
                index = i;
            }
        }
        System.out.println("SLOT USED MAX TIMES (ID): "+slist.get(index).slotid);
    }
}
