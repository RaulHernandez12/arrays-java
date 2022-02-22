
package trabajoarrays4;

import java.util.Scanner;


public class Matriz {
    //Creamos los Atributos
    
    private int tamanio;
    private int matriz[][];
    
    
    //Constructor por defecto
    
    public Matriz (){
        tamanio = 3;
        matriz= new int [tamanio][tamanio];
    }
    
    public Matriz (int tamanio){
        this.tamanio = tamanio;
        matriz = new int [tamanio][tamanio];
    }
    
    public void asignarDatos(int[] vector){        
        Scanner tec;
        tec=new Scanner (System.in);
        int i;
        int j;
        int v = 0;
        int n;           
        
        System.out.println("el tamaño del vector es " + vector.length);
        System.out.println("---------------");
        for (i=0;i<vector.length;i++){
            System.out.println("Introduzca un número");
            n=tec.nextInt();
            vector [i]= n;
        }           
        i=0;
        for(i=0; i<matriz.length ; i++){
            System.out.println();
            for(j=0;j<matriz.length;j++){
                matriz [i][j]=vector[v];
                v++;
                System.out.print(matriz [i][j]+ " ");
            
            }
        }
    }
   
    void leerDatos(int[][]Matriz){
        //Declaración de variables
        Scanner tec;
        tec=new Scanner (System.in);
        int fila;
        int columna;       
        int n;        
        System.out.println("El tamanio de la matriz es "+ matriz.length);               
        System.out.println("---------------");                 
        //Mostramos los números que ha introducido el usuario en forma de tabla
        for(fila=0; fila<matriz.length ; fila++){            
            for(columna=0;columna<matriz.length;columna++){
                System.out.println("Introduzca un número");
                n=tec.nextInt();
                matriz [fila][columna]=n;                                
            }
        }    
    }

public void mostrar(){
    
    int i;
    int j;    
    for(i=0;i<matriz.length;i++){
        System.out.println();
        for(j=0;j<matriz.length;j++){
            System.out.print(matriz[i][j]+" ");
        }        
    }         
}   

/*void suma(Matriz ms){        
    int i = 0;
    int j = 0;
    int suma;
    for(i=0;i<matriz.length;i++){        
        for(j=0;j<matriz.length;j++){
         suma= matriz [i][j]+ ms [i][j];   
         System.out.println(suma);
        }        
    }         
}*/

}
