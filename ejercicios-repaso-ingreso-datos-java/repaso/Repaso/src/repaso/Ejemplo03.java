/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombrePais;
        String capitalPais;
        double extension;
        double promedioEdad;
        
        System.out.println("Ingrese la población del país");
        extension = entrada.nextDouble();
        
        entrada.nextLine();
        
        System.out.println("Ingrese nombre del país");
        nombrePais = entrada.nextLine();
        
        System.out.println("Ingrese la edad promedio del país");
        promedioEdad = entrada.nextDouble();
        
        entrada.nextLine();
        
        System.out.println("Ingrese capital del país");
        capitalPais = entrada.nextLine();
        
        System.out.printf("Datos de país\n\tNombre:%s\n\tCapital:%s"
                + "\n\tPoblación:%.2f\n\tEdad promedio: %.2f\n", 
                nombrePais, capitalPais, extension, promedioEdad);
        
    }
    
}
