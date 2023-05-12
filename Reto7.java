package Retos;
//RETO 7 JUEGO DE CARISELLAZO (BUCLE)
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);


        int dinAcumulado = 0;
        int numRondas = 0;
        int respuesta;
        
        do {
            System.out.print("Ingrese la cantidad de dinero a apostar: ");
            int cantDin = capturar.nextInt();
            
            while (cantDin < dinAcumulado) {
                System.out.println("No cuenta con el dinero para apostar");
                System.out.print("Ingrese otra cantidad de: ");
                cantDin = capturar.nextInt();
            
            }

            numRondas++;

            int resultado = (int) (Math.random() * 2);

            if (resultado == 0) {
                System.out.println("Ha ganado la ronda " + (dinAcumulado += cantDin));   
            } else {
                System.out.println("Ha perdido la ronda " + (dinAcumulado -= cantDin)); 
            }

            System.out.println("Dinero acumulado es de: " + dinAcumulado);
            System.out.print("¿Desea seguir jugando? 1-si    2-no");
            respuesta = capturar.nextInt();
            
        } while (respuesta == 1);
        
        System.out.println("Cantidad de jugadas: " + numRondas);
        System.out.println("Total de dinero acumulado: " + dinAcumulado);



    }
    
}
