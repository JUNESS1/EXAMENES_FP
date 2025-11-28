/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_2_25550471;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN_2_25550471 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion = captu.nextInt();
        if (opcion == 1){
        numerosPrimos();
        }else if(opcion == 2){
            numerosNoprimos();
                
                }else if(opcion == 3){
                    
                }
        }while(opcion != 3);
            
        }

    public static void imprimirMenu() {
        
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("Opciones");
        System.out.println("1.Imprimir los números primos");
        System.out.println("2.Imprimir los números no primos");
        System.out.println("3.Salir del sistema");
        System.out.println("Seleciona una opcion: ");
    }
    //verificador de si es primo o no
    public static boolean esPrimo(int num) {
        if (num <= 1) {
        return false; 
    }
    boolean primo = true; 
    for (int i = 2; i < num; i++) {
        int residuo = num % i;
        if (residuo == 0) { 
            primo = false;
            break;
        }
    }
    return primo;
}

    
    public static void numerosPrimos() {
     Scanner captu = new Scanner(System.in);
        System.out.print("¿Cuántos números desea capturar? ");
        int tama = captu.nextInt();
        int[] numeros = new int[tama];

        for (int i = 0; i < tama; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = captu.nextInt();
        }

        System.out.println("Ingresa números primos");
        for (int num : numeros) {
            if (esPrimo(num)) {
                System.out.print(num + " ");
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void numerosNoprimos() {
        Scanner captu = new Scanner(System.in);
        System.out.print("¿Cuántos números desea capturar? ");
        int tama = captu.nextInt();
       
        }

        
    }
}

        
        
    

