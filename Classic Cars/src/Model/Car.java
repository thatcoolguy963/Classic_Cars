package Model;
import java.util.Scanner;

public class Car {
    private int year;
    private String make;
    private String model;
    private String trim;
    Scanner scan = new Scanner(System.in);

    //Constructor Methods 
    public Car(int year, String make, String model, String trim) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
    }
    // Getter Methods
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getTrim() {
        return trim;
    }

     // Setter Methods 
    public void setYear(int year) {
     while(year < 1900 || year > 2025) {
          System.out.println("Please enter valid year");
          year = scan.nextInt();
         
       }
         this.year = year;
   }

    public void setMake(String make) {
           this.make = make;
    }
    public void setModel(String model) {
          this.model = model;
    }
    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String toString() {
    return Integer.toString(year) + "  "  +  this.make  +  "  " + this.model + 
    " " + this.trim;
    }

    public void quitScanner() {
        scan.close();
    }
}

