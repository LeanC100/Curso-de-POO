package JAVA;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    public void toPrint(){
        System.out.println("License: " + license +  " \nDriver:" + driver.name);
    }
}
