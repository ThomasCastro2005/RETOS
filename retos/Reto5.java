package Retos;
import java.util.Scanner;

// SIGNO ZODIACAL(CONDICIONALES)
public class Reto5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes, dia;
        String signo = "";

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        mes = input.nextInt();

        System.out.print("Ingrese el día de nacimiento (1-31): ");
        dia = input.nextInt();

        
        switch(mes) {
            case 1:
                if (dia <= 19)
                    signo = "Capricornio";
                else
                    signo = "Acuario";
                break;
            case 2:
                if (dia <= 18)
                    signo = "Acuario";
                else
                    signo = "Piscis";
                break;
            case 3:
                if (dia <= 20)
                    signo = "Piscis";
                else
                    signo = "Aries";
                break;
            case 4:
                if (dia <= 19)
                    signo = "Aries";
                else
                    signo = "Tauro";
                break;
            case 5:
                if (dia <= 20)
                    signo = "Tauro";
                else
                    signo = "Géminis";
                break;
            case 6:
                if (dia <= 20)
                    signo = "Géminis";
                else
                    signo = "Cáncer";
                break;
            case 7:
                if (dia <= 22)
                    signo = "Cáncer";
                else
                    signo = "Leo";
                break;
            case 8:
                if (dia <= 22)
                    signo = "Leo";
                else
                    signo = "Virgo";
                break;
            case 9:
                if (dia <= 22)
                    signo = "Virgo";
                else
                    signo = "Libra";
                break;
            case 10:
                if (dia <= 22)
                    signo = "Libra";
                else
                    signo = "Escorpio";
                break;
            case 11:
                if (dia <= 21)
                    signo = "Escorpio";
                else
                    signo = "Sagitario";
                break;
            case 12:
                if (dia <= 21)
                    signo = "Sagitario";
                else
                    signo = "Capricornio";
                break;
            default:
                System.out.println("El mes ingresado no es válido.");
        }

        System.out.println("Tu signo zodiacal es " + signo + ".");
    }
}
