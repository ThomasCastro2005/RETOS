package Retos;
import java.util.Scanner;
//JUEGO DE PIEDRA PAPEL O TIJERA CON BUCLE
public class Reto8 {
    private static int opPlayer1;

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int res;
        do{
            System.out.println(" ");
        System.out.println("---------Bienvenido A PIEDRA - PAPEL o TIJERA---------");
        System.out.println(" ");
        System.out.println("El juego consiste en que cada jugador debera ingresar la opcion que desea para ganar");
        System.out.println(" ");
        System.out.println("Recuerda que: ");
        System.out.println("PAPEL gana a PIEDRA");
        System.out.println("PIEDRA gana a TIJERA");
        System.out.println("TIJERA gana a PAPEL");

  
        
        int opPlayer1;
        int opMaquina = (int)(Math.random()* 2);
        


        System.out.println("0- piedra");
        System.out.println("1- papel");
        System.out.println("2- tijera");
        System.out.println("3- salir");

        System.out.println("escoga una opcion");
        opPlayer1 = capturar.nextInt();

        System.out.println("Opcion maquina: " + opMaquina);

        if(opPlayer1 == 0 & opMaquina == 0){
            System.out.println("Has EMPATADO");
        }else if(opPlayer1 == 1 & opMaquina == 0 ){
            System.out.println("Has GANADO");
        }else if(opPlayer1 == 0 & opMaquina == 1){
            System.out.println("Has PERDIDO");
        }else if(opPlayer1 == 2 & opMaquina == 0 ){
            System.out.println("Has GANADO");
        }else if(opPlayer1 == 0 & opMaquina == 2){
            System.out.println("Has PERDIDO");
        }else if(opPlayer1 == 1 & opMaquina == 2 ){
            System.out.println("Has PERDIDO");
        }else if(opPlayer1 == 2 & opMaquina == 1){
            System.out.println("Has GANADO");
        }else if(opPlayer1 == 1 & opMaquina == 1 ){
            System.out.println("Has EMPATADO");
        }else if(opPlayer1 == 2 & opMaquina == 2){
            System.out.println("Has EMPATADO");
        }    
        else{
            System.out.println("Esta opcion es invalida.");
        }System.out.println("¿Quiere jugar Otra vez? 1-si     2-no");
        res= capturar.nextInt();
        }while(res == 1);
        System.out.println("gracias por participar en el juego");




            
  }
 }

