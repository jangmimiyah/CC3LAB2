import java.util.Scanner;

public class CC3mwehe {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            UnitConverter converter = new UnitConverter();
            boolean continueConversion = true;
            int invalidAttemptCount = 0;
            
            while (continueConversion) {
                System.out.println("\nChoose a conversion:");
                System.out.println("1. Kilometers to Miles");
                System.out.println("2. Miles to Kilometers");
                System.out.println("3. Celsius to Fahrenheit");
                System.out.println("4. Fahrenheit to Celsius");
                System.out.println("5. US Dollars to Philippine Pesos");
                System.out.println("6. Philippine Pesos to US Dollars");
                System.out.println("7. Exit");
                System.out.println("\nSubukan mong mag exceed sa 7!!!");
                
                int choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        invalidAttemptCount = 0;
                        System.out.print("\nEnter kilometers: ");
                        double kilometers = scanner.nextDouble();
                        System.out.println("Miles: " + converter.convertKilometersToMiles(kilometers));
                    }
                    case 2 -> {
                        invalidAttemptCount = 0;
                        System.out.print("\nEnter miles: ");
                        double miles = scanner.nextDouble();
                        System.out.println("Kilometers: " + converter.convertMilesToKilometers(miles));
                    }
                    case 3 -> {
                        invalidAttemptCount = 0;
                        System.out.print("\nEnter Celsius: ");
                        double celsius = scanner.nextDouble();
                        System.out.println("Fahrenheit: " + converter.convertCelsiusToFahrenheit(celsius));
                    }
                    case 4 -> {
                        invalidAttemptCount = 0;
                        System.out.print("\nEnter Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        System.out.println("Celsius: " + converter.convertFahrenheitToCelsius(fahrenheit));
                    }
                    case 5 -> {
                        invalidAttemptCount = 0;
                        System.out.print("\nEnter US Dollars: ");
                        double usDollars = scanner.nextDouble();
                        System.out.println("Philippine Pesos: " + converter.convertUSDollarsToPhilippinePesos(usDollars));
                    }
                    case 6 -> {
                        invalidAttemptCount = 0;
                        System.out.print("\nEnter Philippine Pesos: ");
                        double philippinePesos = scanner.nextDouble();
                        System.out.println("US Dollars: " + converter.convertPhilippinePesosToUSDollars(philippinePesos));
                    }
                    case 7 -> continueConversion = false;
                    default -> {
                        invalidAttemptCount++;
                        switch (invalidAttemptCount) {
                            case 1 -> System.out.println("\n---- ~(=3=)~ ----\nNO, YOU'RE WRONG! ULITIN MO!!");
                            case 2 -> System.out.println("\n---- ~(=_=)~ ----\nNO NGA!!! YOU'RE WRONG!!!");
                            case 3 -> System.out.println("IS YOU OBOB? NO NGA!!");
                            default -> System.out.println("\n---- ~(# =0=)~!? ----\nNOO NGA!!! YOU'RE VERY WRONG! BABAGSAK KANA!!!");
                        }
                    }
                }
                System.out.println("-------------------------------------------");
            }
        }
    }
}

class UnitConverter {
    public double convertKilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convertUSDollarsToPhilippinePesos(double usDollars) {
        return usDollars * 56.21;
    }

    public double convertPhilippinePesosToUSDollars(double philippinePesos) {
        return philippinePesos / 56.21;
    }
}
