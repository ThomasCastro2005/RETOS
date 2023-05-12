package Retos;
import java.util.Scanner;
// Saber dosis a aplicar al bebe VACUNA
public class Reto2{
    public static void main(String[] args) {
        //Declarar variables
        int mesesBebe, pesoBebe, Dosis = 0;
        Scanner capturar = new Scanner (System.in);
        System.out.println("Bienvenido al programa");

        //solicitamos el dato 1
        System.out.println("Ingrese los meses del bebe: ");
        //capturamos dato 1
        mesesBebe = capturar.nextInt();

        //solicitamos el dato 2
        System.out.println("Ingrese el peso del bebe: ");
        //capturamos dato 2
        pesoBebe = capturar.nextInt();

        // operacion
        Dosis = (pesoBebe + 10 / mesesBebe * 10) * 8 ;

        System.out.println("La dosis que se le debe aplicar al bebe es: " + Dosis + " ml");

        capturar.close();
    }
}
