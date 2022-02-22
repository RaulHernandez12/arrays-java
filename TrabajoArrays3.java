
package trabajoarrays3;

import java.util.Scanner;


public class TrabajoArrays3 {

  
    public static void main(String[] args) {
        //Declaramos variables 
        Scanner tec;
        tec=new Scanner(System.in);
        int i;
        int contador=9;
        int pos=0;
        
        //Declaramos el vector
        int [] enteros;        
        enteros=new int []{1,2,3,4,5,6,7,8,9,10};
        
        //Mostramos los numeros que hay en el vector
        System.out.println("Los numeros del vector son");
        for(i=0;i<=contador;i++){
            System.out.print(enteros[i]+ " ");
        }
        System.out.println();
        
        //Le pedimos al usuario que posicion del vector desea quitar
        System.out.println("Indique la posicion que desee quitar");
        pos=tec.nextInt();
        
        //Hacemos un bucle por si el usuario introduce una posicion no valida
        while(pos < 0 || pos > 9){
            System.out.println("La posicion es incorrecta");
            System.out.println("Introduzca otro numero");
            pos=tec.nextInt();
        }
        
     
        
        for(i=pos;i<=contador;i++){
            enteros[i-1]=enteros[i];
        }
        contador--;
         for(i=0;i<=contador;i++){
        System.out.print(enteros[i]+ " ");
        }
                 
    }
    
}
