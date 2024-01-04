import java.util.Scanner;

public class Converter {

    // метод конвертації миль в кілометри
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    // метод для виведення миль в кілометри
    public static void printMilesToKilometers(double miles) {
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");
    }

    // Метод для конвертації миль в кілометри
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    // метод для виведення кілометрів в милі
    public static void printKilometersToMiles(double kilometers) {
        double miles = kilometersToMiles(kilometers);
        System.out.println(kilometers + " кілометрів = " + miles + " миль");
    }

}

