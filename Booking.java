package Busresv;

import java.util.Scanner;
import java.util.ArrayList;

class Booking {
    public static void main(String args[]){

        ArrayList<Bus> buses=new ArrayList<Bus>();

        buses.add(new Bus(1,true,60));
        buses.add(new Bus(2,false,45));
        buses.add(new Bus(3,true,  50));

        int userOpt=1;
        Scanner scanner=new Scanner(System.in);
        while (userOpt==1){

        System.out.println("Enter 1 to book the bus");
        userOpt=scanner.nextInt();
        if(userOpt == 1){
            System.out.println("Booking......");
        }
    }
}
}
