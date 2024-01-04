public class Converter {
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static void printMilesToKilometers(double miles) {
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " миль = " + kilometers + " кілометрів");
    }

}
