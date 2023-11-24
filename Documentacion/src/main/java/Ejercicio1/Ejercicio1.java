/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Leamdro
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        metodos_funciones mf=new metodos_funciones();
        Scanner sc=new Scanner(System.in);
        System.out.println("Seleccione la accion a realizar"
                + "\n 1. Convertir un numero decimal a binario"
                + "\n 2. Numero de cifras de un numero dado por teclado"
                + "\n 3. Convertir un monto en colones a dólares, euros, libras y yenes"
                + "\n 4. Determinar si un numero es primo o no");
        
        int op=sc.nextInt();
        String dato;
        switch (op){
            case 1:
                System.out.println("ingrese numero");
                dato = sc.next();
                if(dato.isEmpty()){
                    System.out.println("error campo vacio");
                }else{
                    System.out.println("numero binario" + mf.binario(dato));
                }break;
            case 2:
                System.out.println("ingrese numero");
                dato = sc.next();
                if(dato.isEmpty()){
                    System.out.println("error campo vacio");
                }else{
                    System.out.println("numero binario" + mf.binario(dato))
                }
                
        }
    }
}
