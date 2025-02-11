import java.util.Scanner;

public class ConverterCC3 {
public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
    Converter converter = new Converter();
    boolean continueConversion = true;
    
    while (continueConversion) {
    System.out.println("\nChoose a conversion:");
    System.out.println("1. Kilometers to Miles");
    System.out.println("2. Miles to Kilometers");
    System.out.println("3. Celsius to Fahrenheit");
    System.out.println("4. Fahrenheit to Celsius");
    System.out.println("5. US Dollars to Philippine Pesos");
    System.out.println("6. Philippine Pesos to US Dollars");
    System.out.println("7. Exit");
    
    
    int choice = scanner.nextInt();
    
    switch (choice) {
    case 1 -> {
        System.out.print("\nEnter kilometers: ");
        double kilometers = scanner.nextDouble();
        converter.setKilometers(kilometers);
        System.out.println("Miles: " + converter.ConvertKilometersToMiles());
        System.out.println("-------------------------------------------");
            }
    case 2 -> {
        System.out.print("\nEnter miles: ");
        double miles = scanner.nextDouble();
        converter.setMiles(miles);
        System.out.println("Kilometers: " + converter.ConvertMilesToKilometers());
        System.out.println("-------------------------------------------");
            }
    case 3 -> {
        System.out.print("\nEnter Celsius: ");
        double celsius = scanner.nextDouble();
        converter.setCelsius(celsius);
        System.out.println("Fahrenheit: " + converter.ConvertCelsiusToFahrenheit());
        System.out.println("-------------------------------------------");
            }
    case 4 -> {
        System.out.print("\nEnter Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        converter.setFahrenheit(fahrenheit);
        System.out.println("Celsius: " + converter.ConvertFahrenheitToCelsius());
        System.out.println("-------------------------------------------");
            }
    case 5 -> {
        System.out.print("\nEnter US Dollars: ");
        double usDollars = scanner.nextDouble();
        converter.setUsDollars(usDollars);
        System.out.println("Philippine Pesos: " + converter.ConvertUSDollarsToPhilippinePesos());
        System.out.println("-------------------------------------------");
            }
    case 6 -> {
        System.out.print("\nEnter Philippine Pesos: ");
        double philippinePesos = scanner.nextDouble();
        converter.setPhilippinePesos(philippinePesos);
        System.out.println("US Dollars: " + converter.ConvertPhilippinePesosToUSDollars());
        System.out.println("-------------------------------------------");
            }
    case 7 -> continueConversion = false;
    default -> {
        System.out.println("Invalid input.");
            }
    }
    }
    
    scanner.close();
}
}
}

class Converter {
private double kilometers;
private double miles;
private double celsius;
private double fahrenheit;
private double usDollars;
private double philippinePesos;

public double getKilometers() { return kilometers; }
public void setKilometers(double kilometers) { this.kilometers = kilometers; }

public double getMiles() { return miles; }
public void setMiles(double miles) { this.miles = miles; }

public double getCelsius() { return celsius; }
public void setCelsius(double celsius) { this.celsius = celsius; }

public double getFahrenheit() { return fahrenheit; }
public void setFahrenheit(double fahrenheit) { this.fahrenheit = fahrenheit; }

public double getUsDollars() { return usDollars; }
public void setUsDollars(double usDollars) { this.usDollars = usDollars; }

public double getPhilippinePesos() { return philippinePesos; }
public void setPhilippinePesos(double philippinePesos) { this.philippinePesos = philippinePesos; }

public double ConvertKilometersToMiles() {
return this.kilometers * 0.621371;
}

public double ConvertMilesToKilometers() {
return this.miles * 1.60934;
}

public double ConvertCelsiusToFahrenheit() {
return (this.celsius * 9 / 5) + 32;
}

public double ConvertFahrenheitToCelsius() {
return (this.fahrenheit - 32) * 5 / 9;
}

public double ConvertUSDollarsToPhilippinePesos() {
return this.usDollars * 56.21;
}

public double ConvertPhilippinePesosToUSDollars() {
return this.philippinePesos / 56.21;
}
}