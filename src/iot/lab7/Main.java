package iot.lab7;

public class Main {
    public static void main(String [] args){
        Laptop dell = new Laptop("Dell", "Inspiron 3537", 1.7,
                                 12, 350, 14, true,
                                 true, false, 10000);
        Laptop lenovo = new Laptop("Lenovo", "IdeaPad 5 15ARE", 2.3, 16);
        Laptop acer = new Laptop();
        System.out.println("First laptop:" + dell);
        System.out.println("Second laptop:" + lenovo);
        System.out.println("Third laptop:" + acer);

        Laptop.printStaticCount();
        acer.printCount();
    }
}
