package Retos;
// JUEGO CARA Y SELLO(condicionales)
import java.util.Scanner;
import java.util.Random;

public class Reto4 {

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        Random rand = new Random();
        
        int opcion;
        int resultado = (int) (Math.random()*2+1);
        
        System.out.println("JUEGO CARA Y SELLO");
        System.out.println("0 para CARA y 1 para SELLO");
        opcion = capturar.nextInt();
        
        if(opcion == resultado) {
            System.out.println("GANASTE");
        } else {
            System.out.println("PERDISTE BRO");
        }
        
        if(resultado == 0) {
            System.out.println("El resultado ES CARA");
        } else {
            System.out.println("El resultado ES SELLO");
        }
    }
}
