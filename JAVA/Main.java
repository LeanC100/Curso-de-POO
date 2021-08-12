package JAVA;

class Main{
    public static void main(String[] args){

        Car car = new Car("DFD-432", new Account("Leandro", "23.324.432"));
        
        car.toPrint();
    }
}