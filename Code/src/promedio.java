
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reginamjr.14
 */
public class promedio {
        public static void main(String[] args) {
       Scanner mientrada = new Scanner(System.in);  
       int [] Vector;
       int tamano=10,j=0;
       float acumula=0;
       Vector=new int[tamano];
       System.out.printf("%s %8s \n","Indice","Valor");
       for( j=0;j<Vector.length;j++){
      System.out.printf("integese las notas %d",j+1);
      Vector[j]=mientrada.nextInt();
      for(j=0;j<Vector.length;j++){
       acumula=acumula+Vector[j]; 
                  
      }
      acumula=acumula/tamano;
System.out.printf("%s %8s \n ","No.Alumno","NOTA");
for (j=0;j<Vector.length;j++){
    System.out.printf("%5d %8d\n",j+1,Vector[j]);
}
 System.out.printf("el promedio es ",acumula);
    }
    
}
}
    

