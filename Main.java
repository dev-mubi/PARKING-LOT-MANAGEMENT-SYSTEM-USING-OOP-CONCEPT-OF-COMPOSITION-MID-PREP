import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int choice;
        Scanner a = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SLOTS IN PARKING LOT: ");
        int NOS = a.nextInt();
        ParkingLot parklot = new ParkingLot(NOS);
        System.out.println("(PLEASE ENABLE SLOTS BEFORE ADDING VEHICLES)\n");
        a.nextLine();
        while (true) {
            System.out.println("1) ADD(PARK) VEHICLE\n2) REMOVE VEHICLE FROM PARKING\n3) ENABLE SLOT\n4) SHOW AVAILABLE SLOTS\n5) MOST USED SLOT\n6) EXIT SYSTEM\n\n");
            System.out.println("ENTER YOUR CHOICE: ");
            choice = a.nextInt();
            switch (choice) {
                case 1:
                {
                    System.out.println("1) NEW ENTRY\n2) ALREADY REGISTERED\n\nENTER YOUR CHOICE");
                    int chc = a.nextInt();
                    a.nextLine();
                    switch (chc)
                    {
                        case 1:
                        {
                            Vehicle y = null;
                            a.nextLine();
                            System.out.println("ENTER OWNER NAME: ");
                            String name = a.nextLine();
                            System.out.println("ENTER VEHICLE TYPE: ");
                            String type = a.nextLine();
                            System.out.println("ENTER LISCENCE PLATE:");
                            String plate = a.nextLine();
                            y = new Vehicle(plate, name, type, true);
                            //parklot.vlist.add(new Vehicle(plate,name,type, true));
                            parklot.addvehicle(y);
                            break;
                        }
                        case 2:
                        {
                            int c=0;
                            System.out.println("ENTER LICENSE NUMBER RTO ADD VEHICLE: ");
                            String l = a.nextLine();
                            for (int i=0;i<parklot.vlist.size();i++)
                            {
                                if (parklot.vlist.get(i).getLiscenceplate().equals(l))
                                {
                                    parklot.addvehicle(parklot.vlist.get(i));
                                    c=1;
                                    break;
                                }
                            }
                            if (c !=1)
                            {
                                System.out.println("VEHICLE NOT REGISTERED");
                            }
                            break;
                        }
                        default:
                        {
                            System.out.println("INCORRECT SELECTION");
                        }
                    }
                    break;
                }
                case 2: {
                    a.nextLine();
                    System.out.println("ENTER LICENSE NUMBER TO REMOVE VEHICLE: ");
                    String Ln = a.nextLine();
                    parklot.removevehicle(Ln);
                    break;
                }
                case 3: {
                    if (parklot.slist.size() < NOS)
                    {
                        System.out.println("ENTER SLOT ID: ");
                        int slotid = a.nextInt();
                        parklot.slist.add(new slot(false,slotid ,0));
                        a.nextLine();
                    } else {
                        System.out.println("MAX SLOT LIMIT REACHED");
                    }
                    break;
                }
                case 4: {
                    parklot.display_slots();
                    break;
                }
                case 5: {
                    parklot.mostused();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default: {
                    System.out.println("INVALID INPUT");
                }

            }
        }


    }



}
