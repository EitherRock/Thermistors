import java.util.Scanner;


public class Thermistor {
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);

        var inputResistance = 5000.0;
        var resistance = 10000;
        var celsius = 25;
        var kelvin = 3960;
        var celToKel = celsius + 273;
        var naturalLog = Math.log(inputResistance / resistance);
        var bottomMult = celToKel * naturalLog;





        var temperature = ((kelvin * celToKel) / (bottomMult + kelvin) - 273);

        System.out.print("Please enter a resistance: ");

        while (!scanner.hasNextDouble())
        {
            System.out.println("Please try again.");
            scanner.nextLine();
            System.out.print("Please enter a resistance: ");
        }
        inputResistance = scanner.nextDouble();
        System.out.println(inputResistance);
        System.out.println(resistance);
        System.out.println(kelvin);
        System.out.println(naturalLog);
        System.out.println(bottomMult);

        System.out.println("Celsius temperature);



    }

}

//use Math.log()

