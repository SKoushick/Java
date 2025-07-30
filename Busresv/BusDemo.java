package Busresv;

import java.util.ArrayList;
import java.util.Scanner;

class BusDemo {
    public static void main(String args[]){

        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<BusDemo> bookings=new ArrayList<BusDemo>();

        buses.add(new Bus(1,true,60));
        buses.add(new Bus(2,false,45));
        buses.add(new Bus(3,true,  50));

        int userOpt=1;
        Scanner scanner=new Scanner(System.in);

        for (Bus b:buses){
            b.displayBusInfo();
        }
        while (userOpt==1){

        System.out.println("Enter 1 to book the bus");
        userOpt=scanner.nextInt();
        if(userOpt == 1){
            BusDemo booking=new BusDemo();
            if(booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                System.err.println("your booking is confirmed...");
            }
            else
            System.out.println("sorry the bus is full");
        }
    }
}

    private boolean isAvailable(ArrayList<BusDemo> bookings, ArrayList<Bus> buses) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
