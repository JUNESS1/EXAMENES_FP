/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isc_fpc_25550471_eva1_examen_practico;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class ISC_FPC_25550471_EVA1_EXAMEN_PRACTICO {

   final static String USUARIO = "junessy";
    final static String PWD = "1234";
    public static void main(String[] args) {
     String usu, contra;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("************BIENVENIDO*********** ");
        System.out.println("Sistema de venta de un supermercado ");
        System.out.print("Usuario:");
        usu = captu.nextLine();
        System.out.print("Contraseña:");
        contra = captu.nextLine();
        
        if(usu.equals(USUARIO)){//COMPARAR CADENAS 
            if (contra.equals(PWD)){
                System.out.println("ACCESO CONCEDIDO!");
            }else{
                System.out.println("ACCESO DENEGADO!");
            }
        }else{
            System.out.println("ACCESO DENEGADO!!");
       
        int opcion;
        System.out.println("************MENU*********** ");
        System.out.println("Solicite una opcion (1 al 3): ");
        opcion = captu.nextInt();
        if(opcion == 1){
            System.out.println("1. Consultar saldo");
            
        } else if(opcion == 2){
            System.out.println("2. Retirar dinero");
            
            } else if(opcion == 3){
            System.out.println("3. Depositar dinero");
                }else{
           System.out.println("Opcion no válida!!");
           
           double montoRetirar;
     System.out.println("Monto de la compra del usuario: ");
        montoRetirar = captu.nextDouble();
       
       //ESTRUCTURA DE CONTROL IF
       if ( montoRetirar >= 5000){
        System.out.print("Retiro: ");
        System.out.println(montoRetirar);
       }
}
        }
        
    }
}
