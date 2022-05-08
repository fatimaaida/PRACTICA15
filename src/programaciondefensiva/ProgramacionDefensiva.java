/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciondefensiva;

import java.util.Scanner;

//FATIMA AIDA LEON REBOLLO
public class ProgramacionDefensiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        //PRIMER EJERCICIO
        Scanner scanner = new Scanner(System.in);
        char opcion;
        System.out.println("-/-/-/-/-/-/-/- BIENVENIDO-/-/-/-/-/-/-/-");
        System.out.println("Ingrese un numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un numero:");
        int num2 = scanner.nextInt();
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("INGRESE LA OPERACION QUE DESEA REALIZAR ");
        System.out.println("A. Suma");
        System.out.println("B. Resta");
        System.out.println("C. Multiplicacion");
        System.out.println("D. Division");
        System.out.println();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        opcion = scanner.next().toUpperCase().charAt(0);
        System.out.println("El resultado de la operacion solicitada es:");
        
        // switch de las operaciones
        switch(opcion)
        {
            //SUMA
            case 'A':
                System.out.println(Ejercicio1.suma(num1, num2));
                break;
                //RESTA
            case 'B':
                System.out.println(Ejercicio1.resta(num1, num2));
                break;
                //MULTIPLICACION
            case 'C':
                System.out.println(Ejercicio1.multiplicacion(num1, num2));
                break;
                //DIVISION
            case 'D':
                System.out.println(Ejercicio1.division(num1, num2));
                break;
                // NO SELECCIONO UNA OPCION DEL MENU
            default:
                System.out.println("LA OPCION QUE SELECCIONO NO SE ENCUENTRA DISPONIBLE.");
                break; 
        }*/
        //SEGUNDO EJERCICIO
        
        Ejercicio2.juego();
    }
    
}
