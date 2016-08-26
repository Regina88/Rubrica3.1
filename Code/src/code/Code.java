/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author reginamjr.14
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner var = new Scanner (System.in);
        // TODO code application logic here
        System.out.println("Universidad Laica Eloy Alfaro de Manabí ==FACCI===");
        System.out.println("Hola Profesor este es un deber de Ingenieria del Software II");
        System.out.println("Realizado por Regina Vera Ramirez ");
        if (var.nextLine().equals("1")){
            
        }
        
    }
    
    public void calculadora(){
        
    Scanner mientrada = new  Scanner(System.in);
        String suma="1";// para las opciones
        String resta="2";
        String multiplicar="3";
        String Dividir="4";
        String opcion="";
        //COMENTARIO
        String nuevo="hola";
        //Paso 2
        
        int Valor_1=0,Valor_2=0,Sumar=0;
        System.out.println("***calculador basica**");
        System.out.println("1_sumar              *");
        System.out.println("2_restar             *");
        System.out.println("3_multiplicar        *");
        System.out.println("4_dividir            *");
        System.out.println("***escoja la que le guste***");
        System.out.println("****************************");
        
        //paso 3
        opcion=mientrada.nextLine();
        if (opcion.equals(suma))
            System.out.println("dele valor a la variable 1");
            Valor_1=mientrada.nextInt();
            System.out.println("ingrese valor variable 2 ");
            Valor_2=mientrada.nextInt();
            Sumar=Valor_1+Valor_2;


}
    
    
}