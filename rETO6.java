package Retos;
// RETO 6 TIENDA (BUCLE)
import java.util.Scanner;
public class rETO6 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);


        int cantidadPro;
        float precioPro;
        float total = 0;

        System.out.println("Ingrese la cantidad de productos");
        cantidadPro = capturar.nextInt();

        for (int i=0; i < cantidadPro; i++ ){
            System.out.println("ingrese precio del  producto " + (i + 1) + ":");
            precioPro = capturar.nextFloat();

            total += precioPro;
        }
        System.out.println("El total de la compra es: " + total);

    }
}
