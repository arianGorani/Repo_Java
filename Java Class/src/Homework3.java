public class Homework3 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println();

        //Celsius to Fahrenheit
        System.out.println("Celsius to Fahrenheit");

        double cTemp = 20;
        double fTemp = cTemp * 9/5 + 32;

        System.out.println(cTemp + " °C" + "  -->  " + fTemp + " °F" );
        System.out.println();

        //-------------------------------------------------------------//
        System.out.println("-----------------------------------");
        System.out.println();

        //Celsius to Kelvin
        System.out.println("Celsius to Kelvin");

        double ceTemp = 20;
        double  kTemp = ceTemp + 273.15;

        System.out.println(ceTemp + " °C" + "  -->  " + kTemp + " K" );
        System.out.println();

        //-------------------------------------------------------------//
        System.out.println("-----------------------------------");
        System.out.println();

        //Fahrenheit to Celsius
        System.out.println("Fahrenheit to Celsius");

        double faTemp = 68;
        double celTemp = (faTemp - 32) * 5/9;

        System.out.println(faTemp + " °F" + "  -->  " + celTemp + " °C" );
        System.out.println();

        //-------------------------------------------------------------//
        System.out.println("-----------------------------------");
        System.out.println();

        //Fahrenheit to Kelvin
        System.out.println("Fahrenheit to Kelvin");

        double fahTemp = 20;
        double keTemp = (fahTemp - 32) * 5/9 +273.15;

        System.out.println(fahTemp + " °F" + "  -->  " + keTemp + " K" );
        System.out.println();

        //-------------------------------------------------------------//
        System.out.println("-----------------------------------");
        System.out.println();

        //Kelvin to Fahrenheit
        System.out.println("Kelvin to Fahrenheit");

        double kelTemp = 50;
        double fahrTemp = kelTemp * 9/5 - 459.67;

        System.out.println(kelTemp + " K" + "  -->  " + fahrTemp + " °F" );
        System.out.println();

        //-------------------------------------------------------------//
        System.out.println("-----------------------------------");
        System.out.println();

        //Kelvin to Celsius
        System.out.println("Kelvin to Celsius");

        double kelvTemp = 200;
        double celsTemp = kelvTemp - 273.15;

        System.out.println(kelvTemp + " K" + "  -->  " + celsTemp + " °C" );
        System.out.println();

        //-------------------------------------------------------------//
        System.out.println("-----------------------------------");


    }
}
