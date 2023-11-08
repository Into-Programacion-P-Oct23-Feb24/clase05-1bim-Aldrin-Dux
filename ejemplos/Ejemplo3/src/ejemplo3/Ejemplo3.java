/*
 Realizar un programa en java que permita determinar si un estudiante ha pasado 
el ciclo se ingresa el promedio del estudiante
- Un estudiante pasa el ciclo si tiene un promedio mayor o igual a 7.5 

- Si el estudiante aprueba el ciclo, presentar un mensaje como sigue, 
Estudiante aprobado con un promedio: ?
- Si el estudiante tiene una nota mayor o igual a 5 y menor o igual a 7.4 
presentar un mensaje con el siguiente texto; Estudiante en suspenso con un promedio: ? 
- Si el estudiante tiene una nota menor a 5 presentar un mensaje con el 
siguiente texto; Estudiante reprobado con un promedio: ? 
 */
package ejemplo3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        // Condicionales aninados
        // >= 7.5 Aprobado 
        // >= 5 and < 7.5 Suspenso
        // >=3 and <5 Recueracion
        // <3 Reprobado
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double promedio;
        String nombre;
        String apellido;
        
        System.out.println("Ingresar Nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingresar Apellido");
        apellido = entrada.nextLine();
        System.out.println("Ingresar promedio");
        promedio = entrada.nextDouble();
       

        if (promedio >= 7.5) {
            System.out.printf("Estudiante %s %s aprobado con un "
                    + "promedio: %.2f\n",nombre,apellido, promedio);
        } else {
            if ((promedio >= 5) && (promedio < 7.5)) {
                System.out.printf("Estudiante %s %s en suspenso con un "
                        + "promedio: %.2f\n",nombre,apellido, promedio);
            } else {
                if ((promedio >=3) && (promedio <5)){
                System.out.printf("Estudiante %s %s en recuperacion con un "
                        + "promedio: %.2f\n",nombre,apellido, promedio);
                }else{
                    if (promedio <3){
                       System.out.printf("Estudiante %s %s  reprobado con un "
                        + "promedio: %.2f\n",nombre,apellido, promedio); 
                    }
                }
                
            }
                
            

        }
    }

}
