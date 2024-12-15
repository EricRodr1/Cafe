/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafee;
import java.util.Scanner;
/**
 *
 * @author Eric Rodriguez
 */
public class Cafee {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int CafePequeno = 45;
        int CafeMediano = 56;
        int CafeGrande = 65;
        int leche = 5;
        int cremora = 8;
        int sencillo = 0;
        int eleccionn ;
        int eleccion;
        double totalapagar;
        int mayordeedad;
        
        System.out.println("BIENVENIDO A CAFE EXPRESS UNI");
        
        System.out.println("MENU : " );
        System.out.println("1. CafePequeno");
        System.out.println("2. CafeMediano");
        System.out.println("3. CafeGrande");
        System.out.println("Favor seleccione una opcion");
        eleccion = sc.nextInt();
        
        switch (eleccion){
            
        
                case 1 -> {
                    System.out.println("Como quisiera su cafe ? ");
                    System.out.println("1. Leche");
                    System.out.println("2. Cremora");
                    System.out.println("3. Sencillo");
                    eleccionn = sc.nextInt();
                    
            switch (eleccionn) {
                case 1 -> {
                    totalapagar = CafePequeno + leche;
                    System.out.println("Favor ingrese su edad: ");
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafePequeno + leche * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafePequeno + leche;
                        System.out.println("Su total es: " +totalapagar);
                    }
                       
                        
                     
                }
                case 2 -> {
                    
                    totalapagar = CafePequeno + cremora;
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafePequeno + cremora * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafePequeno + cremora;
                        System.out.println("Su total es: " +totalapagar);
                    }
                    
                }
                case 3 -> {
                    totalapagar = CafePequeno + sencillo;
                    System.out.println("Su total es "+totalapagar);
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafePequeno  * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafePequeno;
                        System.out.println("Su total es: " +totalapagar);
                    }
                }
                default -> System.out.println("Opcion Invalida");
            }
            }
                    
                case 2 -> {
                    System.out.println("Como quisiera su cafe ? ");
                    System.out.println("1. Leche");
                    System.out.println("2. Cremora");
                    System.out.println("3. Sencillo");
                    eleccionn = sc.nextInt();
                    
            switch (eleccionn) {
                case 1 -> {
                    totalapagar = CafeMediano + leche;
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafeMediano + leche * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafeMediano + leche;
                        System.out.println("Su total es: " +totalapagar);
                    }
                     
                }
                case 2 -> {
                    totalapagar = CafeMediano + cremora;
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafeMediano + cremora * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafeMediano + cremora;
                        System.out.println("Su total es: " +totalapagar);
                    }
                    
                }
                case 3 -> {
                    totalapagar = CafeMediano + sencillo; 
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafeMediano + cremora * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafeMediano + cremora;
                        System.out.println("Su total es: " +totalapagar);
                    }
                }
                default -> System.out.println("Opcion Invalida");
            }
            }
                    
                case 3 -> { 
                    System.out.println("Como quisiera su cafe ? ");
                    System.out.println("1. Leche");
                    System.out.println("2. Cremora");
                    System.out.println("3. Sencillo");
                    eleccionn = sc.nextInt();
                    
            switch (eleccionn) {
                case 1 -> {
                    totalapagar = CafeGrande + leche;
                    
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafeGrande + leche * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafeGrande + leche;
                        System.out.println("Su total es: " +totalapagar);
                    }
                }
                case 2 -> {
                    totalapagar = CafeGrande + cremora;
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafeGrande + cremora * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafePequeno + cremora;
                        System.out.println("Su total es: " +totalapagar);
                    }
                }
                case 3 -> {
                    totalapagar = CafeGrande + sencillo;
                    mayordeedad = sc.nextInt();
                    if (mayordeedad >= 65){
                        totalapagar = CafePequeno + sencillo * 0.20;
                        System.out.println("Su total es" +totalapagar);
                    }else {
                        totalapagar = CafePequeno + sencillo;
                        System.out.println("Su total es: " +totalapagar);
                    }
                }
                default -> System.out.println("Opcion Invalida");
            }
            }


                    
        }           
    }
}
