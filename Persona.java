/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String cedula;
        String sexo;
        int altura;
        int peso;
        
        System.out.println("ingrese nombre");
       nombre=sc.nextLine();
       
        System.out.println("ingrese edad");
        edad=sc.nextInt();
        
        System.out.println("ingrese cedula");
        cedula=sc.nextLine();
        
        System.out.println("ingrese altura");
        altura=sc.nextInt();
        
        System.out.println("ingrese peso");
        peso=sc.nextInt();
        
         
        if (edad >=18)
            System.out.println("es mayor de edad");
        else 
            
            System.out.println("es menor de edad");
         
        
   
   
    }
    
}
