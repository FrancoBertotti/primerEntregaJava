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
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n1, n2 ;       
        
        System.out.print("Ingresa numero: ");
        n1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingresa otro numero: ");
        n2 = Integer.parseInt(input.nextLine());
        
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
        
    }
    
}
