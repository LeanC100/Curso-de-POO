package JAVA;

class Main{
    public static void main(String[] args){
        
        Car car = new Car("DFD-432", new Account("Leandro", "23.324.432"));
        car.toPrint();

        UberX uberX = new UberX("UGH-123", new Account("Maria", "32.123.542"), "Chevrolet", "Spark");
        uberX.toPrint();

    }
}