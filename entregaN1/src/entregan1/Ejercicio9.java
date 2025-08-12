/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregan1;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR, la solucion es cambiar "nextInt" por "nextLine", porque no puede convertir un integer a string
        System.out.println("Hola, " + nombre);

    }
    
}
