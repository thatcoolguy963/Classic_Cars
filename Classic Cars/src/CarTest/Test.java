package CarTest;
import java.util.Scanner;

import Model.Car;

public class Test {
    
    public static void main(String[] args) {
        boolean quit = false;
        String toQuit;
        String model, make, trim;
        int year = 0;
        Scanner scan = new Scanner(System.in);

        Car car = new Car(0, " ", " ", " ");

        while(!quit) {
            System.out.println("Please enter the car year, make, and model between the years of 1900 to 2025");
            year = scan.nextInt();
            make = scan.next();
            model = scan.next();
            trim = scan.next();

            car.setYear(year);
            car.setMake(make);
            car.setModel(model);
            car.setTrim(trim);
            scan.nextLine();

            System.out.println("Here's the data you provided: " + car);
            System.out.println("Press Q to quit or any other key to continue");
            toQuit = scan.next();

            if(toQuit.equalsIgnoreCase("Q")) {
                quit = true;
            }
        } 
        scan.close();
        car.quitScanner();
        System.out.println("Thank You and have a good day ! ");

    }
}
