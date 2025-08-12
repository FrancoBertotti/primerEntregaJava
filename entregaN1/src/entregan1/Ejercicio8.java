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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1, n2, div;       
        double dn1, ddiv;
        
        System.out.print("Ingresa numero: ");
        n1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa otro numero: ");
        n2 = Integer.parseInt(input.nextLine());
        
        div = n1 / n2;
                
        System.out.println("Resultado de la division con INT: " + div);
        
        dn1=  n1; //casting para tratar n1 como double, diferentes formas de realizarlo
        ddiv = dn1/n2;
        System.out.println("Resultado de la division con DOUBLE: " + ddiv);
        
    }
    
}
