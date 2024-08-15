package Busresv;

class Bus {

int busno;
boolean ac;
int capacity;

Bus(int no,boolean ac,int cap){
    this.busno=no;
    this.ac=ac;
    this.capacity=cap;

}

public int getbusno(){
    return busno;
}
public void setbusno(int no){
    busno=no;

}

public boolean getac(){
    return ac;
}

public void setac(boolean ac){
    ac=ac;
}

public int getcapacity(){
    return capacity;
}
public void setcapacity(int cap){
    capacity=cap;
}

public void displayBusInfo(){
    System.out.println("Busno"+busno+"acornot"+ac+"capacity"+capacity);
}
}
