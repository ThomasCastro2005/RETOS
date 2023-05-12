package Retos;
import java.util.Scanner;
//convertir grados F a C  RETO 1 (horno)
public class Reto1{
    public static void main(String[] args) {
        //Declarar variables
        double temp,   C = 0;
        //llamar al Scanner
        Scanner capturar = new Scanner (System.in);
        System.out.println("Bienvenido al programa");

        //solicitamos el dato 1
        System.out.println("Digite el grado a convertir");
        //capturamos dato 1
        temp = capturar.nextInt();


        // operacion
        C = (temp - 32) / 1.8;

        System.out.println("El grado Fahrenheit " + temp + "°F" +  " a celcius es igual a: " + C + " °C");


        capturar.close();
    }
    
}
