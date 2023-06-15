
package com.mycompany.conversio;

import java.util.Scanner;


public class menu_commits {
    
    
    
    
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
    
       boolean salir = false;
       int opcion;
       
       do {
         System.out.println("Opcions que pots triar");
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = sc.nextInt();
       

       
       
       
       
       switch (opcion) {
           
           case 1 -> {
               System.out.println("Introdueix en €");
               int valor_euros = sc.nextInt();
               
               
               double tipus_de_canvi = 0.87d;
               System.out.println(valor_euros + " eur0s (€) actualment equivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
           }
            
           case 2 -> {           
               System.out.println("Introdueix en lliures");
               int valor_lliures = sc.nextInt();
               
               double tipus_de_canvi = 1.17;
               System.out.println(valor_lliures + " eur0s (€) actualment equivalen a" + (valor_lliures * tipus_de_canvi) + " lliures esterlines (£)");
               
     }
           
           case 3 -> System.out.println("Adeu, vagi b");
           default -> System.out.println("Opcio incorrecta ha de ser del 1 al 3");
               
               
               
               
               
               
               
               
           }
       
       
       
       
       
       
               
        
       }while (opcion != 3);
       
       } 

}

        