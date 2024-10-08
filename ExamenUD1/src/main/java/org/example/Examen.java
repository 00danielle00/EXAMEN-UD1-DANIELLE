package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void Ejercicio1(){

        Scanner entrada = new Scanner(System.in); //SIRVE PARA CAPTURAR LOS VALORES INTRODUCIDOS PR EL TECLADO

        int num = 0; //DECLARO UNA VARIABLE QUE TIENE COMO VALOR INICIAL 0

        while (num >=0){ // HAGO UN BUCLE

            try { //USO EL TRY-CATCH PARA QUE EL USUARIO NO INTRODUZCA OTRO VALOR PARA QUE NO SEA UN NUMERO.
                System.out.println("Introduce un numero..."); //MUESTRO POR PANTALLA LA SIGUIENTE FRASE
                num = entrada.nextInt(); //PIDO EL NUMERO

                int resultado = num * (-1);//CALCULO EL VALOR ABSOLUTO E UNA VARIABLE CON NOMBRE RESULTADO
                System.out.println("El valor absoluto es: " + resultado); //muestro por pantalla el valor absoluto del numero introducido

            }
            catch (InputMismatchException error){
                System.out.println("Error, introduce un numero valido.");//Se muestra este error cuando el usuariopone un valor que no es un numero.
                entrada.next();//limpia el buffer
            }

        }
    }

    public void Ejercicio2(){

    //El siguiente programa debe calcular el minimo de azulejos que necesita una pared.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String nombre = entrada.next(); //variable que recoge el nombre introducido anteriormente
        System.out.println("La obra de " + nombre); //imprime por pantalla la obr5a de y el nombre introducido

        System.out.println("Introduce el ancho de la pared:");
        int ancho = entrada.nextInt(); //variable que recoge el valor del ancho

        System.out.println("Introduce el largo de la pared:");
        int largo = entrada.nextInt(); //variable que recoge el valor del largo

        System.out.println("Introduce ancho azulejo:");
        int anchoazulejo = entrada.nextInt(); //recoge el valor del alto del azulejo

        System.out.println("Introduce largo azulejo:");
        int largoazulejo = entrada.nextInt(); //recoge el valor del largo del azulejo

        if (anchoazulejo == largoazulejo);//codicion para evitar que los azulejos no sean cuadrados.
        System.out.println("El azulejo no puede ser un cuadrado");

        if (anchoazulejo >= ancho || largoazulejo >= largo){ // condicion para evitar que los azulejos no sean más grandes que la pared.
            System.out.println("El azulejo no puede ser mas grande que la pared");
        }
    }


}
