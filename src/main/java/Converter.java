public class Converter {
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static void printMilesToKilometers(double miles) {
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");
    }
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void printKilometersToMiles(double kilometers) {
        double miles = kilometersToMiles(kilometers);
        System.out.println(kilometers + " кілометрів = " + miles + " миль");
    }

}
