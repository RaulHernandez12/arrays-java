
package trabajoarrays1;

import java.util.Scanner;


public class TrabajoArrays1 {

  
    public static void main(String[] args) {
        //Declaramos los arrays y variables que vamos a necesitar 
        Scanner tec;
        tec=new Scanner(System.in);
        int i;
        int N;
        double suma = 0;
        double media1 = 0;
        double media2 = 0;
        double media3 = 0;
        double media4 = 0 ;      
       
        double alumno = 0;
        double[] primerTrimestre;
        primerTrimestre=new double[]{8,7,6,9,0};
        
        double[] segundoTrimestre;
        segundoTrimestre=new double[]{9,9,9,9,3};
        
        double [] tercerTrimestre;
        tercerTrimestre= new double[]{7,8,6,7,5};
        
        //Hacemos un bucle para hacer la media de cada trimestre
        for(i=0;i<=4;i++){
            suma=suma+primerTrimestre[i];
            alumno++;
            media1=suma/alumno;
        }
        suma=0;
        alumno=0;
        for(i=0;i<=4;i++){
            suma=suma+segundoTrimestre[i];
            alumno++;
            media2=suma/alumno;
        }
        suma=0;
        alumno=0;
        for(i=0;i<=4;i++){
            suma=suma+tercerTrimestre[i];
            alumno++;
            media3=suma/alumno;
        }
        //Mostramos la media del grupo en  cada trimestre
        System.out.println("La media del primer trimestre es: "+media1);
        System.out.println("La media del segundo trimestre es: "+media2);
        System.out.println("La media del tercer trimestre es: "+media3);
        
        //Pedimos al usuario que nos indique el alumno del cual quiere conocer su media y la mostramos
        System.out.println("Indique el numero del alumno del cual quiere conocer su media");
        N=tec.nextInt();
        suma=0;
        suma = primerTrimestre[N-1]+segundoTrimestre[N-1]+tercerTrimestre[N-1];// Hacemos N-1 para que el numero introducido se corresponda con la posicion del array          
        media4=suma/3;
        System.out.println("La media en el curso del Alumno "+ N + " es: "+media4);
    }
    
}
