import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення від користувача
        System.out.print("Введіть відстань: ");
        double distance = scanner.nextDouble();

        // Вибір одиниць вимірювання
        System.out.print("Оберіть одиниці вимірювання ('mi' для миль, 'km' для кілометрів): ");
        String unit = scanner.next();

        // Виклик методів конвертації та виведення результату
        if ("mi".equalsIgnoreCase(unit)) {
            printMilesToKilometers(distance);
        } else if ("km".equalsIgnoreCase(unit)) {
            printKilometersToMiles(distance);
        } else {
            System.out.println("Неправильний вибір одиниць вимірювання.");
        }

        // Закриття сканера
        scanner.close();
    }

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

