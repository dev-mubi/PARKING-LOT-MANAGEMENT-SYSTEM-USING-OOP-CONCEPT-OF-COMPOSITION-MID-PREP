public class slot
{
    int slotid;
    boolean isoccupied;
    Vehicle parkedvehicle;
    int count;


    public slot(boolean isoccupied, int slotid,int count)
    {
        this.isoccupied = isoccupied;
        this.slotid = slotid;
        this.parkedvehicle = parkedvehicle;
        this.count = count;
    }

//    public slot(int slotid) OTHER ATTRIBUTES NEED TO BE INITIALIZED
//    {
//        this.slotid = slotid;
//    }

    void assignvehicle(Vehicle a)
    {
        parkedvehicle = a;
        a.parkvehicle();
        isoccupied = true;
        count++;
    }

    void removevehicle(Vehicle a)
    {
        parkedvehicle = null;
        a.removevehiclev();
        isoccupied = false;
    }

    void display()
    {
        if (isoccupied == false)
        {
            System.out.println("THIS SLOT IS FREE\nSLOT ID: "+ slotid);
        }
        else
        {
            System.out.println("THIS SLOT IS OCCUPIED\nSLOT ID: "+ slotid);
        }
    }
}
