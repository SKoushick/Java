package Busresv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Book {
    String passengerName;
    int busno;
    Date date;

    Book(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the passenger Name:");
        passengerName=scanner.next();
        System.out.println("Enter the busNo:");
        busno=scanner.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String DateInput=scanner.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

        try {
            date =dateFormat.parse(DateInput);

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

    public boolean isAvailable(ArrayList<Book> bookings,ArrayList<Bus> buses){
        int capacity=0;
        int booked=0;

        for(Bus bus:buses){
            if(bus.getbusno()==busno){
                capacity=bus.getcapacity();
            }
        for(Book b:bookings){
            if(b.busno==busno && b.date.equals(date)){
                booked++;
            }
        }
        }
        return booked<capacity?true:false;

    }
}
