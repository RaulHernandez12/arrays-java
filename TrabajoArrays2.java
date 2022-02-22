
package trabajoarrays2;

import java.util.Scanner;


public class TrabajoArrays2 {

    
    public static void main(String[] args) {
        //Declaramos variables 
        int op = 0;
        int i;
        Scanner tec;
        tec = new Scanner(System.in);
        int N;
        int pos = 0;
        int contador = 7;
        //Declaramos el array
        int [] numeros;
        numeros=new int[10];
       
       
        
        //Pedimos 8 numeros al usuario
        for(i=0;i<=7;i++){
            System.out.println((i+1)+". Introduzca un  numero");
            numeros[i]=tec.nextInt();
        }
        //Mostramos los numeros que ha introducido el usuario
        
         System.out.println("Los numeros que ha introducido son ");
        for(i=0;i<=contador;i++){
        System.out.print(numeros[i] + " ");
        }
    
        //Preguntamos al usuario que desea hacer ahora
        System.out.println();
        System.out.println("¿Que desea hacer ahora?");
        System.out.println("----------------------");
        System.out.println("1.Introducir los numeros que faltan");
        System.out.println("Cualquier tecla para salir");
        op=tec.nextInt();
        
        if(op==1){
            //Pedimos  al usuario los numeros que faltan y la posicion en la que quiere ponerlos
         
        do{    
            System.out.println();
            
            System.out.println("Introduzca otro numero");
            N=tec.nextInt();
            System.out.println("Indique en la posicion donde desea ponerlo ");
            pos=tec.nextInt();
        
            //Hacemos un bucle por si la posicion introducida no es valida           
            while(pos>contador){
                System.out.println("La posicion es incorrecta");
                System.out.println("Introduzca otra posicion valida");
                pos=tec.nextInt();
            }
        
            //restamos uno a la posicion para que se corresponda con la posicion del array
            pos=pos - 1; 
        
            for(i=contador;i>=pos;i--){
                numeros[i+1]=numeros[i];
            }  
            contador++;
            numeros[pos]=N;
            for(i=0;i<=contador;i++){
                System.out.print(numeros[i]+ " ");
            }
        }while(contador !=9);
        System.out.println();
        System.out.println("El vector está lleno");
        }else{
            System.out.println("Muchas gracias");
        }
    
    }
    
}
