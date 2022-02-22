
package trabajoarrays4;

import java.util.Scanner;


public class TrabajoArrays4 {

    
    public static void main(String[] args) {
        //Declaramos las variables
        Scanner tec;
        tec = new Scanner (System.in);
        int prueba [][]; 
        prueba=new int [0][0];
        //Declaramos las 2 matrices de 3x3 con el constructor por defecto
        Matriz matriz1;
        matriz1 = new Matriz();       
        Matriz matriz2;
        matriz2= new Matriz();
        Matriz matriz3;
        matriz3= new Matriz(3);
        
        //Asignamos los datos a las matrices
        System.out.println("Vamos a introducir los datos de la matriz 1");
        matriz1.leerDatos(new int [0][0]);
        System.out.println("Vamos a introducir los datos de la matriz 2");
        matriz2.leerDatos(prueba);
        
        System.out.println("Los datos de la primera matriz son");
        matriz1.mostrar();
        System.out.println("");
        System.out.println("Los datos de la segunda matriz son");
        matriz2.mostrar();
        System.out.println("");
        /*System.out.println("Vamos a introducir los datos de la matriz 3");
        matriz3.leerDatos(prueba);
        System.out.println("Los datos introducidos son");
        matriz3.mostrar();
        
        matriz3.asignarDatos(new int [9]);
        
        matriz1.suma(prueba);*/
        
        
    }
}
