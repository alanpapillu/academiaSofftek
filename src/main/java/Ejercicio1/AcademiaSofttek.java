package Ejercicio1;

import java.util.Scanner;


public class AcademiaSofttek {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        //Pido por consola que se ingrese el primer número para sumar
        System.out.println("Ingrese el primer número a sumar: ");
        int numero = scanner.nextInt();
        
        //Pido por consola que se ingrese el segundo número para sumar
        System.out.println("Ingrese el segundo número a sumar: ");
        int numero2 = scanner.nextInt();
        
        //Realizo la suma en la variable resultado
        int resultado = numero + numero2;
        
        //Muestro el resultado por consola
        System.out.println("El resultado es " + resultado);
        
        }        
    }

