/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String apellido;
        
        System.out.println("Ingrese su apellido completo");
        apellido = entrada.nextLine();
        System.out.printf("El apellido ingresado es:\n%s\n", apellido);
        
    }
}
